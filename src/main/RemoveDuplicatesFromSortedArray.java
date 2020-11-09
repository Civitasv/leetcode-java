package main;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 * <p>
 * Internally you can think of this:
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int n = nums.length, key = 0, i;
        for (i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[key++] = nums[i];
                while (i + 1 < n && nums[i] == nums[i + 1]) {
                    i++;
                }
            } else nums[key++] = nums[i];
        }
        if (i == n - 1)
            nums[key++] = nums[n - 1];
        return key;
    }
}
