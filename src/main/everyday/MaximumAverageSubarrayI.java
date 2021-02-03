package main.everyday;

/**
 * 子数组最大平均数 I
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int right = k, average = 0;
        for (int i = 0; i < k; i++)
            average += nums[i];
        int max = average;
        while (right < n) {
            int left = right - k;
            average -= nums[left];
            average += nums[right];
            max = Math.max(max, average);
            right++;
        }
        return max / (k * 1.0);
    }
}
