package main.everyday;

/**
 * 螺旋矩阵II
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int row = 0, col = 0;
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右->下->左->上
        int direction = 0;
        boolean[][] vi = new boolean[n][n];
        for (int i = 0; i < n * n; i++) {
            res[row][col] = i + 1;
            vi[row][col] = true;
            int nextRow = row + directions[direction][0];
            int nextCol = col + directions[direction][1];
            if (nextRow >= n || nextRow <= -1 || nextCol >= n || nextCol <= -1 || vi[nextRow][nextCol])
                direction = ++direction % 4;
            row += directions[direction][0];
            col += directions[direction][1];
        }
        return res;
    }
}
