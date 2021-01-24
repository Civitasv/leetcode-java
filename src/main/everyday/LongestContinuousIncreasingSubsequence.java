package main.everyday;

/**
 * 最长连续递增序列
 */
public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int count = 0, i = 0;
        while (i < nums.length - 1) {
            int start = i + 1;
            while (start < nums.length && nums[start] > nums[start - 1]) {
                start++;
            }
            count = Math.max(start - i, count);
            i = start;
        }
        return count;
    }
}
