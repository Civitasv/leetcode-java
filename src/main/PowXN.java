package main;

/**
 * Implement pow(x, n), which calculates x raised to the power n (xn).
 */
public class PowXN {
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        if (x == -1) {
            if (n % 2 == 0)
                return -x;
            else {
                return x;
            }
        }
        if (n == Integer.MIN_VALUE) {
            return 0.0;
        }
        double res = 1.0d;
        boolean flag = false;
        int count = 0;
        if (n < 0) {
            n = -n;
            flag = true;
        }
        while (n != 0) {
            res = res * x;
            n--;
            count++;
            while (n > count) {
                res = res * res;
                n -= count;
                count *= 2;
            }
        }

        if (flag) {
            res = 1 / res;
        }
        return res;
    }

    public double myPow2(double x, int n) {
        if (x == 1 || n == 0)
            return 1;
        if (n == Integer.MIN_VALUE)
            return 1 / x * myPow(x, n + 1);
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
