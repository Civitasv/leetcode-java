package main;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed.
 * All houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one.
 * Meanwhile, adjacent houses have a security system connected,
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers nums representing the amount of money of each house,
 * return the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int n = nums.length;
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int lo, int hi) {
        int dp1, dp2;
        dp1 = nums[lo];
        dp2 = Math.max(nums[lo], nums[lo + 1]);
        for (int i = lo + 2; i <= hi; i++) {
            int max = Math.max(dp1 + nums[i], dp2);
            dp1 = dp2;
            dp2 = max;
        }
        return dp2;
    }

}
