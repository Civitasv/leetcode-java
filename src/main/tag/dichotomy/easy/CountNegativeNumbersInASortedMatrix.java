package main.tag.dichotomy.easy;

/**
 * 统计有序矩阵中的负数
 */
public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0, n = grid[0].length;
        for (int[] row : grid) {
            count += n - binarySearch(row);
        }
        return count;
    }

    private int binarySearch(int[] row) {
        int lo = 0, hi = row.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (row[mid] < 0)
                hi = mid - 1;
            else lo = mid + 1;
        }
        return hi + 1;
    }
}
