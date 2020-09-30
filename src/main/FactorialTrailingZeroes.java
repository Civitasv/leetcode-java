package main;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * res = n/5 + n/25 + n/125 + n/625 + ...
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
