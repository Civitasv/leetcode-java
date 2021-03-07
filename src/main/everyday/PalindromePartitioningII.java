package main.everyday;

import java.util.Arrays;

/**
 * 分割回文串 II
 */
public class PalindromePartitioningII {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n]; // dp[i][j]表示[i, j]内字符串是否回文，显然有dp[i][j] = dp[i+1][j-1] && s[i] = s[j]
        for (boolean[] arr : dp)
            Arrays.fill(arr, true);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
            }
        }
        int[] cut = new int[n];
        Arrays.fill(cut, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if (dp[0][i])
                cut[i] = 0;
            else {
                for (int j = 1; j <= i; j++) {
                    if (dp[j][i]) {
                        cut[i] = Math.min(cut[i], cut[j - 1] + 1);
                    }
                }
            }
        }
        return cut[n - 1];
    }
}
