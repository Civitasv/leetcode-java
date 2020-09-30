package main;

/**
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and ignoring cases.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int lo = 0, hi = c.length - 1;
        while (lo < hi) {
            while (lo < hi && !isAlphabetsOrNumber(c[lo])) {
                lo++;
            }
            while (lo < hi && !isAlphabetsOrNumber(c[hi])) {
                hi--;
            }
            if (lo < hi && c[lo] != c[hi]) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }

    public boolean isAlphabetsOrNumber(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57);
    }
}
