package main;

/**
 * 统计参与通信的服务器
 */
public class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int count = 0;
        int[] numRows = new int[rows];
        int[] numCols = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    numRows[i]++;
                    numCols[j]++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && (numRows[i] > 1 || numCols[j] > 1))
                    count++;
            }
        }
        return count;
    }
}
