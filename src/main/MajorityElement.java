package main;

import java.util.Arrays;

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int count = 1, n = nums.length - 1;
        while (n > 0) {
            if (n == 1 && nums[0] == nums[1]) {
                return nums[0];
            }
            if (nums[n - 1] != nums[n]) {
                if (count > nums.length / 2) {
                    return nums[n];
                }
                count = 1;
            } else {
                count++;
            }
            n--;
        }
        return -1;
    }
}
