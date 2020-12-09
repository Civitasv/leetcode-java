package main.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 问总共有多少条不同的路径？
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return C(m + n - 2, Math.min(m - 1, n - 1));
    }

    public int C(int m, int n) {
        if (n == 0)
            return 1;
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * (m - i + 1) / i;
        }
        return (int) ans;
    }

    public int dp(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0)
                        dp[0][0] = 1;
                    else
                        dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
