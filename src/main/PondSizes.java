package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 水域大小
 * 你有一个用于表示一片土地的整数矩阵land，该矩阵中每个点的值代表对应地点的海拔高度。
 * 若值为0则表示水域。由垂直、水平或对角连接的水域为池塘。
 * 池塘的大小是指相连接的水域的个数。编写一个方法来计算矩阵中所有池塘的大小，返回值需要从小到大排序。
 */
public class PondSizes {
    public int[] pondSizes(int[][] land) {
        if (land == null || land.length == 0) {
            return new int[]{};
        }
        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[land.length][land[0].length];
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 0 && !visited[i][j]) {
                    result.add(pond(land, i, j, visited));
                }
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        Arrays.sort(res);
        return res;
    }

    private int pond(int[][] land, int row, int col, boolean[][] visited) {
        if (row < 0 || row >= land.length || col < 0 || col >= land[0].length || land[row][col] != 0 || visited[row][col]) {
            return 0;
        }
        int size = 1;
        visited[row][col] = true;
        size += pond(land, row - 1, col, visited); // 上
        size += pond(land, row - 1, col - 1, visited); // 左上
        size += pond(land, row - 1, col + 1, visited); // 右上
        size += pond(land, row + 1, col, visited); // 下
        size += pond(land, row + 1, col - 1, visited); // 左下
        size += pond(land, row + 1, col + 1, visited); // 右下
        size += pond(land, row, col - 1, visited); // 左
        size += pond(land, row, col + 1, visited); // 右
        return size;
    }
}
