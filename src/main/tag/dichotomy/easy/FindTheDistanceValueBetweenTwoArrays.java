package main.tag.dichotomy.easy;

import java.util.Arrays;

/**
 * 两个数组间的距离值
 * <p>
 * 思路：对于数组 arr1 中的每个元素，只需要找到数组 arr2 中刚好大于和刚好小于的数字，然后与其进行比较即可
 * <p>
 * 因此，使用二分查找，可以获取第一个大于该元素的索引，若存在则索引小于 arr2.length，否则 arr2 中的所有数字均小于
 * 该元素，此时仅存在比其小的数字，比较一次即可
 */
public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for (int num : arr1) {
            int index = binarySearch(arr2, num);
            boolean ok = true;
            if (index < arr2.length) // 大于它的
                ok &= (Math.abs(arr2[index] - num) > d);
            if (index - 1 >= 0 && index - 1 < arr2.length) // 小于它的
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
