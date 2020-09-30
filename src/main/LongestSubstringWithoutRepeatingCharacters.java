package main;


import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * @param s a string
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        int max = 0, start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            char top = s.charAt(i);
            for (int j = start; j < end; j++) {
                if (top == s.charAt(j)) {
                    start = j + 1;
                }
            }
            end = i + 1;
            max = end - start > max ? end - start : max;
        }
        return max;
    }
}
