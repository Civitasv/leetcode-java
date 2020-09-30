package main;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same character
 * but a character may map to itself.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (!map.containsKey(a)) {
                if (!map.containsValue(b))
                    map.put(a, b);
                else
                    return false;
            } else {
                if (map.get(a) != b)
                    return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s1, String s2) {
        // 1-256: store s1's character 257-512: store s2's character
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i) + 256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i) + 256] = i + 1;
        }
        return true;
    }
}
