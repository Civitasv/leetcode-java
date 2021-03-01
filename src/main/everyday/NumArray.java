package main.everyday;

/**
 * 区域和检索 - 数组不可变
 */
public class NumArray {
    private final int[] dp;

    public NumArray(int[] nums) {
        int n = nums.length;
        dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }
}
