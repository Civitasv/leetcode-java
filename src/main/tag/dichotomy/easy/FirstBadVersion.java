package main.tag.dichotomy.easy;

/**
 * 第一个错误的版本
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (!isBadVersion(mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
