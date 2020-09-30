package main;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String[] strs = str.split(" ");

        char[] chars = pattern.toCharArray();
        if (strs.length != chars.length) return false;

        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(chars[i])) {
                if (!map.get(chars[i]).equals(strs[i])) return false;
            }
            if (map2.containsKey(strs[i])) {
                if (map2.get(strs[i]) != chars[i]) return false;
            }
            map.put(chars[i], strs[i]);
            map2.put(strs[i], chars[i]);
        }
        return true;
    }
}
