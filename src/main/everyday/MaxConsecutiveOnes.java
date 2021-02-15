package main.everyday;

/**
 * 最大连续1的个数
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int left = 0, right = 0, max = 0;
        while (right < n) {
            if (nums[right] == 0) {
                max = Math.max(right - left, max);
                while (right < n && nums[right] == 0)
                    right++;
                left = right;
            } else right++;
        }
        return Math.max(max, right - left);
    }
}
