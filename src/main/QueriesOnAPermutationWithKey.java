package main;

import main.structure.BIT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查询带键的排列
 * <p>
 * 给你一个待查数组 queries ，数组中的元素为 1 到 m 之间的正整数。 请你根据以下规则处理所有待查项 queries[i]（从 i=0 到 i=queries.length-1）：
 * <p>
 * 一开始，排列 P=[1,2,3,...,m]。
 * 对于当前的 i ，请你找出待查项 queries[i] 在排列 P 中的位置（下标从 0 开始），然后将其从原位置移动到排列 P 的起始位置（即下标为 0 处）。注意， queries[i] 在 P 中的位置就是 queries[i] 的查询结果。
 * 请你以数组形式返回待查数组 queries 的查询结果。
 */
public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        int[] res = new int[queries.length];
        List<Integer> list = new ArrayList<>(); // val
        for (int i = 0; i < m; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            int index = -1, query = queries[i];
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == query) {
                    index = j;
                    break;
                }
            }
            res[i] = index;
            list.remove(index);
            list.add(0, queries[i]);
        }
        return res;
    }

    public int[] processQueries2(int[] queries, int m) {
        int n = queries.length;
        int[] res = new int[n];
        int[] index = new int[m + 1];
        BIT bit = new BIT(m + n);
        for (int i = 1; i <= m; i++) {
            index[i] = n + i;
            bit.update(1, n + i);
        }
        for (int i = 0; i < n; i++) {
            int cur = index[queries[i]];
            bit.update(-1, cur);
            res[i] = bit.query(cur);
            cur = n - i;
            index[queries[i]] = cur; // 查询得到的值直接移动到 n - i处，模仿现实世界插队
            bit.update(1, cur); // n - i 处值加一
        }
        return res;
    }
}
