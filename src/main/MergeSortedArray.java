package main;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = m + n - 1, i = m - 1, j = n - 1;
        while (i >= 0 || j >= 0) {
            if(i==-1){
                nums1[count] = nums2[j];
                j--;
            }
            else if(j==-1){
                nums1[count] = nums1[i];
                i--;
            }
            else if (nums1[i] < nums2[j]) {
                nums1[count] = nums2[j];
                j--;
            } else {
                nums1[count] = nums1[i];
                i--;
            }
            count--;
        }
    }
}
