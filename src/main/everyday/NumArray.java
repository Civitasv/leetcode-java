package main.everyday;

/**
 * 区域和检索 - 数组不可变
 */
public class NumArray {
    private int[] dp;

    public NumArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return;
        dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return dp[j];
        else return dp[j] - dp[i - 1];
    }
}
