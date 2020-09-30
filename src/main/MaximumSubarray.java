package main;

/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum
 * and return its sum.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] A) {
        int n = A.length;
        int max = A[0], sum = A[0]; // sum为到i的最大值

        for (int i = 1; i < n; i++) {
            if (sum > 0) {
                sum += A[i];
            } else {
                sum = A[i];
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
