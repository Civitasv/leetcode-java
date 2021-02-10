package main.everyday;

/**
 * 字符串的排列
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int n = s2.length(), x = s1.length();
        int right = 0, len = 0;
        int[] hash = new int[26]; // s1中每个字符出现的次数
        for (char c : s1.toCharArray()) {
            hash[c - 'a']++;
            len++;
        }
        while (right < n) {
            char c = s2.charAt(right);
            if (hash[c - 'a'] > 0) {
                len--;
            }
            hash[c - 'a']--;
            if (right >= x - 1) {
                if (len == 0)
                    return true;
                char c2 = s2.charAt(right - x + 1);
                if (hash[c2 - 'a'] >= 0)
                    len++;
                hash[c2 - 'a']++;
            }
            right++;
        }
        return false;
    }
}
