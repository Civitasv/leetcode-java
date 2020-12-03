package test;


import main.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    void test() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[]{1,2};
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}