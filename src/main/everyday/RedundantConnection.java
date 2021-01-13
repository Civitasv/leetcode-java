package main.everyday;

import java.util.HashSet;
import java.util.Set;

/**
 * 冗余连接
 */
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        for (int[] edge : edges) {
            set.add(edge[0]);
            set.add(edge[1]);
        }
        UnionFind uf = new UnionFind(set.size() + 1);
        for (int[] edge : edges) {
            int a = uf.find(edge[0]);
            int b = uf.find(edge[1]);
            if (a == b)
                return edge;
            uf.union(edge[0], edge[1]);
        }
        return null;
    }

    /**
     * 并查集数据结构
     */
    static class UnionFind {
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
}
