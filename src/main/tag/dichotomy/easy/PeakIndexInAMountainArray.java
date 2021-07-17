package main.tag.dichotomy.easy;

/**
 * 山脉数组的峰顶索引
 */
public class PeakIndexInAMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 1, hi = arr.length - 2;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int ele = arr[mid];
            if (ele > arr[mid - 1] && ele > arr[mid + 1]) {
                return mid;
            } else if (ele < arr[mid - 1]) {
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return -1;
    }
}
