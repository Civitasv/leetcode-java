package main.tag.dichotomy.easy;

/**
 * 第一个错误的版本
 *
 * 思路：
 *
 * 1-n中二分搜索，目的是检索第一个错误的版本，即第一个为false的，若非错误版本，则说明错误还在后面，需要向后遍历，
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
