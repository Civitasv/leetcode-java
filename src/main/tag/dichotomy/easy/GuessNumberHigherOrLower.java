package main.tag.dichotomy.easy;

/**
 * 猜数字大小
 * <p>
 * 思路：二分法常见算法，无特殊
 */
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == 1)
                lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }

    private int guess(int num) {
        return 0;
    }
}
