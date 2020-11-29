package main.contest1129;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给你一个 m x n 的整数网格 accounts ，
 * 其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * <p>
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 */
public class MostRich {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length, n = accounts[0].length;
        int[] clients = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                clients[i] += accounts[i][j];
            }
        }
        Arrays.sort(clients);
        return clients[m - 1];
    }
}
