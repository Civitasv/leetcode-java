package main;

/**
 * Given a binary string s (a string consisting only of '0' and '1's).
 * <p>
 * Return the number of substrings with all characters 1's.
 * <p>
 * Since the answer may be too large, return it modulo 10^9 + 7.
 */
public class NumberOfSubstringsWithOnly1s {
    private double C(int num) {
        if (num < 2) {
            return 0;
        }
        return num * (num - 1) / 2;
    }

    public int numSub(String s) {
        int count = 0, num = 0, m = 1_000_000_007;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count = (count + ++num) % m;
            } else {
                num = 0;
            }
        }
        return count;
    }
}
