package main;

/**
 * 转置矩阵
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * <p>
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 */
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if (A.length == 0)
            return A;
        int row = A.length, col = A[0].length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
