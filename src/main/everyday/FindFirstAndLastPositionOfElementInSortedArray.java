package main.everyday;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (res[0] == -1)
                    res[0] = res[1] = i;
                else res[1] = i;
            }
        }
        return res;
    }

    public int[] searchRange2(int[] nums, int target) {
        return index(nums, target);
    }

    public int[] index(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[]{-1, -1};
        int lo = 0, hi = nums.length - 1;
        int[] res = new int[]{-1, -1};
        if (target > nums[hi] || target < nums[lo])
            return res;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target)
                hi = mid;
            else lo = mid + 1;
        }
        if (nums[lo] != target)
            return res;
        res[0] = lo;
        hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target)
                hi = mid;
            else lo = mid + 1;
        }
        res[1] = lo - 1;
        return res;
    }
}
