package main.everyday;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        // 交换[1, n] [2, n-1]...行
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            exch(matrix, i, n - i - 1);
        }
        // 交换对角线两旁值
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                exch(matrix, i, j, j, i);
            }
        }
    }

    /**
     * 交换矩阵matrix i, j行
     *
     * @param matrix 矩阵
     * @param i      交换行参数
     * @param j      交换行参数
     */
    private void exch(int[][] matrix, int i, int j) {
        int[] a = matrix[i], b = matrix[j];
        for (int k = 0; k < a.length; k++) {
            int temp = a[k];
            a[k] = b[k];
            b[k] = temp;
        }
    }


    /**
     * 交换matrix[i][j] 和 matrix[a][b]
     *
     * @param matrix 矩阵
     * @param i      初始行
     * @param j      初始列
     * @param a      结束行
     * @param b      结束列
     */
    private void exch(int[][] matrix, int i, int j, int a, int b) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[a][b];
        matrix[a][b] = temp;
    }
}
