package main.everyday;

/**
 * 重塑矩阵
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c) return nums;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int index = i * c + j;
                int x = index / n;
                int y = index - x * n;
                res[i][j] = nums[x][y];
            }
        }
        return res;
    }
}
