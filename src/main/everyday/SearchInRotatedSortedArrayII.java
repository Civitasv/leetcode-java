package main.everyday;

/**
 * 搜索旋转排序数组 II
 */
public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int n = nums.length, k = 0;
        // find k
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                k = i + 1;
                break;
            }
        }
        // 二分
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int index;
            if (mid >= (n - k)) index = mid - (n - k);
            else index = mid + k;
            if (nums[index] == target) return true;
            else if (nums[index] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
}
