package main.contest224;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

/**
 * 重新排列后的最大子矩阵
 */
public class MaxMatrix {
    public int largestSubmatrix(int[][] matrix) {
        int res = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n]; // height[i] 表示第i列向上为1的高度
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            Arrays.sort(heights);
            for (int k = n - 1; k >= 0 && heights[k] > 0; k--) {
                int w = n - k;
                int h = heights[k];
                res = Math.max(res, w * h);
            }
        }
        return res;
    }
}
