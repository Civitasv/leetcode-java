package main.contest218;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums 和一个整数 k 。
 * <p>
 * 每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
 * <p>
 * 返回你可以对数组执行的最大操作数。
 */
public class KAndArray {
    public int maxOperations(int[] nums, int k) {
        int count = 0, n = nums.length, lo = 0, hi = n - 1;
        Arrays.sort(nums);
        while (lo < hi) {
            int val = nums[lo] + nums[hi];
            if (val == k) {
                count++;
                hi--;
                lo++;
            } else if (val > k) {
                hi--;
            } else lo++;
        }
        return count;
    }
}
