package main.tag.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 * <p>
 * 思考：
 * 如果只有字母会很简单，26种可能，使用数组即可，但是如果可能为所有Unicode字符，就不能使用数组了，
 * 需要使用Map数据结构，存储每个字符出现的频次。
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] alphabets = new int[26];
        for (int i = 0, n = s.length(); i < n; i++) {
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }
        for (int num : alphabets) {
            if (num != 0) return false;
        }
        return true;
    }

    /**
     * Unicode字符
     *
     * @param s 字符串S
     * @param t 字符串T
     * @return 是否相互为字母异位词
     */
    private boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0, n = s.length(); i < n; i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Map.Entry<Character, Integer> e : freq.entrySet())
            if (e.getValue() != 0) return false;
        return true;
    }
}
