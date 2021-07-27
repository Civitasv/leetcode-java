package main.tag.dichotomy.easy;

import java.util.Arrays;

/**
 * 两个数组间的距离值
 */
public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int num : arr1) {
            int index = binarySearch(arr2, num);
            boolean ok = true;
            if (index < arr2.length)
                ok &= (Math.abs(arr2[index] - num) > d);
            if (index - 1 >= 0 && index - 1 < arr2.length)
                ok &= (Math.abs(arr2[index - 1] - num) > d);
            count += ok ? 1 : 0;
        }
        return count;
    }

    private int binarySearch(int[] arr, int num) {
        int lo = 0, hi = arr.length - 1;
        if (arr[hi] < num) return hi + 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (arr[mid] < num) {
                lo = mid + 1;
            } else hi = mid - 1;
        }
        return lo;
    }
}
