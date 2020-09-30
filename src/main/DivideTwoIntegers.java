package main;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else return -dividend;
        }
        if (divisor == 1) return dividend;
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) return 1;
            return 0;
        }

        int count = 0;
        if (dividend > 0 && divisor > 0) {
            while (dividend - divisor >= 0) {
                dividend -= divisor;
                count++;
            }
        } else if (dividend < 0 && divisor < 0) {
            while (dividend - divisor <= 0) {
                dividend -= divisor;
                count++;
            }
        } else if (dividend > 0 && divisor < 0) {
            while (dividend + divisor >= 0) {
                dividend += divisor;
                count--;
            }
        } else if (dividend < 0 && divisor > 0) {
            while (dividend + divisor <= 0) {
                dividend += divisor;
                count--;
            }
        }

        return count;
    }
}
