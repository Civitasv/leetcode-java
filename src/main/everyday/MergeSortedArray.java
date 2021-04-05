package main.everyday;

import java.util.Arrays;

/**
 * 合并有序数组
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[m];
        System.arraycopy(nums1, 0, arr, 0, m);
        while (k < m + n) {
            if (i >= m) nums1[k] = nums2[j++];
            else if (j >= n) nums1[k] = arr[i++];
            else if (arr[i] > nums2[j]) nums1[k] = nums2[j++];
            else nums1[k] = arr[i++];
            k++;
        }
    }
}
