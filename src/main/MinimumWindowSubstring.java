package main;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串
 */
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int n = s.length();
        int left = 0, right = 0, len = t.length(), min = Integer.MAX_VALUE;
        String minStr = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        while (right < n) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                if (map.get(c) > 0)
                    len--;
                map.put(c, map.get(c) - 1);
            }
            // 当len变成0，说明一个序列找到了
            while (len == 0) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    minStr = s.substring(left, right + 1);
                }
                // 左指针向右
                char lc = s.charAt(left);
                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) + 1);
                    if (map.get(lc) > 0) {
                        len++;
                    }
                }
                left++;
            }
            right++;
        }
        return minStr;
    }
}
