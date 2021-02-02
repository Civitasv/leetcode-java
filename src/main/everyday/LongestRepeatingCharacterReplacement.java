package main.everyday;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 替换后的最长重复字符
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int max = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        int left = 0, right = 0, N = s.length();
        while (right < N) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
            // 判断是否符合题意
            int maxCn = Collections.max(map.values());
            while (right - left + 1 - maxCn > k) {
                // 移动左指针
                char lc = s.charAt(left);
                if (map.containsKey(lc)) {
                    map.put(lc, map.get(lc) - 1);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
