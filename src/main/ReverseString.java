package main;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * You may assume all the characters consist of printable ascii characters.
 */
public class ReverseString {
    public void reverseString(char[] s) {
        reverseString(0, s.length - 1, s);
    }

    public void reverseString(int lo, int hi, char[] s) {
        if (lo >= hi)
            return;
        char tmp = s[lo];
        s[lo] = s[hi];
        s[hi] = tmp;
        reverseString(++lo, --hi, s);
    }
}
