package main.everyday;

/**
 * 寻找数组的中心索引
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0, sum = 0;
        for (int num : nums)
            sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
}
