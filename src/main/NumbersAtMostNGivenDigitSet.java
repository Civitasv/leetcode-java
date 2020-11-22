package main;

/**
 * Given an array of digits, you can write numbers using each digits[i] as many times as we want.  For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
 * <p>
 * Return the number of positive integers that can be generated that are less than or equal to a given integer n.
 * <p>
 * 1 <= digits.length <= 9
 * digits[i].length == 1
 * digits[i] is a digit from '1' to '9'.
 * All the values in digits are unique.
 * 1 <= n <= 109
 */
public class NumbersAtMostNGivenDigitSet {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        int len = length(n), count = 0, num = digits.length;
        for (int i = 1; i < len; i++) {
            count += A(num, i);
        }
        return 0;
    }

    public int length(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public int A(int m, int n) {
        if (m < n)
            throw new IllegalStateException("m can't less than n");
        int res = 1;
        while (n != 0) {
            res *= m--;
            n--;
        }
        return res;
    }

    public int C(int m, int n) {
        if (m < n)
            throw new IllegalStateException("m can't less than n");
        return A(m, n) / A(n, n);
    }
}
