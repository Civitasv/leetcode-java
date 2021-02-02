package main;

/**
 * 将 x 减到 0 的最小操作数
 */
public class MinimumOperationsToReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int left = 0, right = 0, sum = 0, val = 0, max = -1;
        for (int num : nums)
            sum += num;
        while (right < n) {
            val += nums[right];
            // 判断与x的关系
            while (left <= right && sum - val < x) {
                val -= nums[left];
                left++;
            }
            if (sum - val == x) max = Math.max(max, right - left + 1);
            right++;
        }
        return max == -1 ? -1 : n - max;
    }
}
