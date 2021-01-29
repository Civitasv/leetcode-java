package main.everyday;

/**
 * 水位上升的泳池中游泳
 */
public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        // 二分搜索
        int lo = 0, hi = rows * cols - 1, ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            boolean[][] vi = new boolean[rows][cols];
            if (grid[0][0] <= mid && existPath(grid, vi, mid, 0, 0)) {
                ans = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return ans;
    }

    private boolean existPath(int[][] grid, boolean[][] vi, int k, int row, int col) {
        if (row == grid.length - 1 && col == grid[0].length - 1) return true;
        boolean down = row < grid.length - 1 && !vi[row + 1][col] && grid[row + 1][col] <= k;
        boolean up = row > 0 && !vi[row - 1][col] && grid[row - 1][col] <= k;
        boolean right = col < grid[0].length - 1 && !vi[row][col + 1] && grid[row][col + 1] <= k;
        boolean left = col > 0 && !vi[row][col - 1] && grid[row][col - 1] <= k;
        if (down || right || up || left) {
            boolean result = false;
            if (down) {
                vi[row + 1][col] = true;
                result = existPath(grid, vi, k, row + 1, col);
            }
            if (right) {
                vi[row][col + 1] = true;
                result = result || existPath(grid, vi, k, row, col + 1);
            }
            if (up) {
                vi[row - 1][col] = true;
                result = result || existPath(grid, vi, k, row - 1, col);
            }
            if (left) {
                vi[row][col - 1] = true;
                result = result || existPath(grid, vi, k, row, col - 1);
            }
            return result;
        } else return false;
    }
}
