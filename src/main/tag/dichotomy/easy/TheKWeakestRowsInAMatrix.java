package main.tag.dichotomy.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 矩阵中战斗力最弱的 K 行
 */
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for (int row = 0; row < mat.length; row++) {
            pq.add(new int[]{row, power(mat[row])});
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = pq.remove()[0];
        return res;
    }

    private int power(int[] row) {
        int res = 0;
        for (int x : row) {
            if (x == 0) break;
            res += x;
        }
        return res;
    }
}
