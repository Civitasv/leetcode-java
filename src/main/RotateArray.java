package main;


/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) k -= nums.length;
        int lo = 0, hi = nums.length - 1;
        reverse(nums, lo, hi);
        reverse(nums, 0, k - 1);
        reverse(nums, k, hi);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
