package main.everyday;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 交换字符串中的元素
 */
public class SmallestStringWithSwaps {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        if (pairs.size() == 0)
            return s;
        // 构建并查集
        int n = s.length();
        UnionFind uf = new UnionFind(n);
        // 合并
        for (List<Integer> pair : pairs) {
            uf.union(pair.get(0), pair.get(1));
        }
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int fa = uf.find(i);
            if (map.containsKey(fa)) {
                PriorityQueue<Character> pq = map.get(fa);
                pq.offer(s.charAt(i));
            } else {
                PriorityQueue<Character> pq = new PriorityQueue<>();
                pq.offer(s.charAt(i));
                map.put(fa, pq);
            }
        }
        // 重组字符串
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = uf.find(i);
            builder.append(map.get(index).poll());
        }
        return builder.toString();
    }
}

/**
 * 并查集数据结构
 */
class UnionFind {
    int[] father; // 存储元素的父节点

    public UnionFind(int n) {
        father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i; // 初始化所有元素的父节点为其本身
        }
    }

    /**
     * 查询操作
     * <p>
     * 查询两个元素是否在同一个集合中，获得元素 的根节点
     * 根节点的父节点为本身
     * 加入路径压缩，加快查询效率
     *
     * @param x 查询的元素
     * @return x 所在树的根节点
     */
    public int find(int x) {
        if (father[x] == x)
            return x;
        else {
            // 使x的父节点等于x的父节点的父节点
            father[x] = find(father[x]);
            return father[x];
        }
    }

    /**
     * 合并操作
     * <p>
     * 把两个不相交的集合合并为一个集合
     * 只需要查询i的父节点，使其
     *
     * @param i 集合i
     * @param j 集合j
     */
    public void union(int i, int j) {
        father[find(i)] = find(j);
    }
}
