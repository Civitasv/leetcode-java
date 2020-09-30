package main;

import java.util.Arrays;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int num = 0;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            num += count / 2 * 2;
        }
        return num == chars.length ? num : num + 1;
    }
}
