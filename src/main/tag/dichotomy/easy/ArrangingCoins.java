package main.tag.dichotomy.easy;

/**
 * 排列硬币
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        if (n <= 0) return 0;
        int lo = 0, hi = n;
        long sum = 0;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            sum = (long) mid * (mid + 1);
            if (sum > 2L * n) {
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return lo - 1;
    }
}
