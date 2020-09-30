package main;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    /**
     * Brute Force
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * Recursion with Memoization
     * <p>
     * 存储常用的值
     *
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        int[] memo = new int[n + 1]; // store the climbStairs(n)
        return recursion(n, memo);
    }

    public int recursion(int n, int[] memo) {
        if (n == 1 || n == 2)
            return n;
        if (memo[n] > 0)
            return memo[n];
        memo[n] = recursion(n - 1, memo) + recursion(n - 2, memo);
        return memo[n];
    }

    /**
     * Dynamic Programming
     * <p>
     * 考虑子问题并一般化为公式
     *
     * @param n
     * @return
     */
    public int climbStairs3(int n) {
        if (n == 1)
            return 1;
        int[] dp = new int[n + 1]; // dp[i] store number of steps to approach i. dp[i] = dp[i-1] + dp[i-2]
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    /**
     * Fibonacci Number
     *
     * @param n
     * @return
     */
    public int climbStairs4(int n) {
        if (n == 1)
            return 1;
        int first = 1;
        int second = 2;
        int res = 0;

        for (int i = 3; i < n + 1; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}