package test;


import main.MergeSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortedArrayTest {
    @Test
    void test() {
        MergeSortedArray array = new MergeSortedArray();
        int[] nums1 = {1, 2, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        array.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}