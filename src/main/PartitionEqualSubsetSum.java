package main;

import java.util.Arrays;
import java.util.List;

/**
 * 分割等和子集
 * <p>
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * 注意:
 * <p>
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return false;
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0)
            return false;
        int target = sum / 2;
        if (maxNum > target)
            return false;
        boolean[][] dp = new boolean[n][target + 1]; // dp[i][j]表示能否从子数组nums[0, i]中选取若干个整数，使其和为j 所以我们就要求nums[n-1][target]的值
        for (int i = 0; i < n; i++) {
            dp[i][0] = true; // i=0到n，不选取任何数，和为0，所以为true
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (num > j) {
                    // 不能选nums[i]
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 可以选可以不选
                    dp[i][j] = dp[i - 1][j - num] || dp[i - 1][j];
                }
            }
        }
        return dp[n - 1][target];
    }

    // 回溯的一般思路
    private boolean equalsSum(int[] nums, int sum, int start, int target) {
        if (sum == target)
            return true;
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            if (sum + num <= target) {
                sum += num;
                if (equalsSum(nums, sum, i + 1, target)) {
                    return true;
                } else sum -= num;
            }
        }
        return false;
    }
}
