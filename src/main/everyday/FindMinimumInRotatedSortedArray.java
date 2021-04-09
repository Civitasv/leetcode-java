package main.everyday;

/**
 * 旋转数组最小值
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (nums[mid] >= nums[hi]) lo = mid + 1;
            else hi = mid;
        }
        return nums[lo];
    }
}
