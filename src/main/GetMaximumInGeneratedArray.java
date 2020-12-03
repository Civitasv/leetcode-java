package main;

/**
 * You are given an integer n. An array nums of length n + 1 is generated in the following way:
 * <p>
 * nums[0] = 0
 * nums[1] = 1
 * nums[2 * i] = nums[i] when 2 <= 2 * i <= n
 * nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
 * Return the maximum integer in the array nums
 */
public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 0)
            return 0;
        int max = 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 1; 2 * i <= n; i++) {
            nums[2 * i] = nums[i];
            if (2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                max = Math.max(nums[2 * i + 1], max);
            }
        }
        return max;
    }
}
