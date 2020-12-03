package main;

import java.util.List;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note:
 * <p>
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        return findWord(s, 0, wordDict);
    }

    /**
     * 查找是否包含某s
     *
     * @param s        字符串
     * @param start    开始位置
     * @param wordDict 字典
     * @return 是否包含
     * 超出时间
     */
    public boolean findWord(String s, int start, List<String> wordDict) {
        if (s.length() == start)
            return true;
        boolean result = false;
        for (String word : wordDict) {
            int temp = start, index = 0, n = word.length();
            while (index < n && temp < s.length() && s.charAt(temp) == word.charAt(index)) {
                index++;
                temp++;
            }
            if (index == n) {
                result = findWord(s, temp, wordDict);
            }
        }
        return result;
    }

    /**
     * DP 算法
     * dp[i] -> s.substring(0,i) 是否可以segment
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreakDP(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

