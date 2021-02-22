package main.everyday;

/**
 * 矩阵
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int lines = rows + cols - 1;
        for (int i = 0; i < lines; i++) {
            int r = Math.max(0, rows - i - 1);
            int c = Math.max(0, i - rows + 1);
            int val = matrix[r][c];
            while (r < rows && c < cols) {
                if (matrix[r][c] != val)
                    return false;
                r++;
                c++;
            }
        }
        return true;
    }
}
