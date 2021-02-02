package main.everyday;

import java.util.*;

/**
 * 替换后的最长重复字符
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] alphabets = new int[26];
        int left = 0, right = 0, N = s.length(), maxN = 0;
        while (right < N) {
            alphabets[s.charAt(right) - 'A']++;
            // 判断是否符合题意
            maxN = Math.max(maxN, alphabets[s.charAt(right) - 'A']);
            if (right - left + 1 - maxN > k) {
                // 移动左指针
                alphabets[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }
}
