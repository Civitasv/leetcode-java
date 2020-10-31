package main;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value,
 * write a function to search target in nums. If target exists, then return its index, otherwise return -1.
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        if (target > nums[hi] || target < nums[lo])
            return -1;

        while (lo <= hi) {
            int index = (lo + hi) / 2, val = nums[index];
            if (target == val) return index;
            else if (target > val) lo = index + 1;
            else hi = index - 1;
        }
        return -1;
    }
}
