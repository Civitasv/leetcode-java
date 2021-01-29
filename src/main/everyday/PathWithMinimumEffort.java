package main.everyday;

/**
 * 最小体力消耗路径
 */
public class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        // 二分搜索
        int lo = 0, hi = 999999, ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            boolean[][] vi = new boolean[rows][cols];
            if (existPath(heights, vi, mid, 0, 0)) {
                ans = mid;
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return ans;
    }

    private boolean existPath(int[][] heights, boolean[][] vi, int k, int row, int col) {
        if (row == heights.length - 1 && col == heights[0].length - 1) return true;
        boolean down = row < heights.length - 1 && !vi[row + 1][col] && Math.abs(heights[row + 1][col] - heights[row][col]) <= k;
        boolean up = row > 0 && !vi[row - 1][col] && Math.abs(heights[row - 1][col] - heights[row][col]) <= k;
        boolean right = col < heights[0].length - 1 && !vi[row][col + 1] && Math.abs(heights[row][col + 1] - heights[row][col]) <= k;
        boolean left = col > 0 && !vi[row][col - 1] && Math.abs(heights[row][col - 1] - heights[row][col]) <= k;
        if (down || right || up || left) {
            boolean result = false;
            if (down) {
                vi[row + 1][col] = true;
                result = existPath(heights, vi, k, row + 1, col);
            }
            if (right) {
                vi[row][col + 1] = true;
                result = result || existPath(heights, vi, k, row, col + 1);
            }
            if (up) {
                vi[row - 1][col] = true;
                result = result || existPath(heights, vi, k, row - 1, col);
            }
            if (left) {
                vi[row][col - 1] = true;
                result = result || existPath(heights, vi, k, row, col - 1);
            }
            return result;
        } else return false;
    }
}
