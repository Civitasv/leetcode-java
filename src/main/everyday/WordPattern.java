package main.everyday;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        char[] patterns = pattern.toCharArray();
        String[] strs = s.split(" ");
        if (patterns.length != strs.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < patterns.length; i++) {
            if (map.containsKey(patterns[i])) {
                String val = map.get(patterns[i]);
                if (!val.equals(strs[i]))
                    return false;
            } else map.put(patterns[i], strs[i]);
            if (map2.containsKey(strs[i])) {
                char val = map2.get(strs[i]);
                if (val != patterns[i])
                    return false;
            } else map2.put(strs[i], patterns[i]);
        }
        return true;
    }
}
