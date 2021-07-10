package main.tag.dichotomy.easy;

/**
 * 有效的完全平方数
 * <p>
 * 思路：当num<2即num==1时满足条件，当num<2即num==1时满足条件，当num>=4时，num^2/4>=num成立，因此可设置hi=num/2，然后应用二分查找即可
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        int lo = 2, hi = num / 2;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return false;
    }
}
