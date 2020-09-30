package main;

/**
 * Implement int sqrt(int x).
 * <p>
 * Since the return type is an integer,
 * the decimal digits are truncated and only the integer part of the result is returned.
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x == 1 || x == 0)
            return x;
        int res = 0;
        for (int i = 0; i < x; i++) {
            if (i * i >= 0 && i * i <= x) {
                res = i;
            } else {
                break;
            }
        }
        return res;
    }

    public int mySqrt2(int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
    }

    /**
     * binary search
     *
     * @param x
     * @return
     */
    public int mySqrt3(int x) {
        if (x == 0 || x == 1)
            return x;
        int lo = 0, hi = x;
        while (true) {
            int mid = (lo + hi) / 2;
            if (mid <= x / mid) {
                if ((mid + 1) > (x / (mid + 1))) {
                    return mid;
                }
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
    }
}
