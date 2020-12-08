package main.everyday;

import java.util.Arrays;

/**
 * 翻转矩阵后的得分
 * <p>
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1。
 * <p>
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * <p>
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * <p>
 * 返回尽可能高的分数。
 */
public class MatrixCore {
    public int matrixScore(int[][] A) {
        int score = 0;
        for (int col = 0; col < A[0].length; col++) {
            int zeroNum = 0, oneNum = 0;
            for (int row = 0; row < A.length; row++) {
                if (A[row][0] != 1) {
                    for (int j = 0; j < A[0].length; j++) {
                        if (A[row][j] == 0)
                            A[row][j] = 1;
                        else A[row][j] = 0;
                    }
                }
                if (A[row][col] == 1)
                    oneNum++;
                else zeroNum++;
            }
            // 对colNum判断
            if (oneNum < zeroNum) {
                // 转
                for (int i = 0; i < A.length; i++) {
                    if (A[i][col] == 1)
                        A[i][col] = 0;
                    else A[i][col] = 1;
                }
            }
        }
        for (int[] a : A) {
            score += two2Ten(a);
        }
        return score;
    }

    private int two2Ten(int[] a) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += a[a.length - i - 1] << i;
        }
        return res;
    }
}
