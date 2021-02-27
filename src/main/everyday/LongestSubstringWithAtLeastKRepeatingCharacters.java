package main.everyday;

/**
 * 至少有K个重复字符的最长子串
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        if (k == 1)
            return s.length();
        return longestSubstring(s, k, 0, s.length() - 1);
    }

    private int longestSubstring(String s, int k, int start, int end) {
        if (end - start + 1 < k) return 0; // 如果s的长度小于k，那么返回0
        int[] alphabets = new int[26];
        for (int i = start; i <= end; i++)
            alphabets[s.charAt(i) - 'a']++;
        char split = 0;
        for (int i = start; i <= end; i++) {
            int alphabet = alphabets[s.charAt(i) - 'a'];
            if (alphabet > 0 && alphabet < k) {
                split = s.charAt(i);
                break;
            }
        }
        if (split == 0) // 不需要切割
            return end - start + 1;

        int l = start;
        int res = 0;
        while (l <= end) {
            while (l <= end && s.charAt(l) == split) // 跳过所有等于split的
                l++;
            int a = l;
            while (l <= end && s.charAt(l) != split) // 得到不等于split的一段
                l++;
            int len = longestSubstring(s, k, a, l - 1);
            res = Math.max(res, len);
        }
        return res;
    }
}
