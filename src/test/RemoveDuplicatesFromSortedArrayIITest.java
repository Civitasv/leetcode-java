package test;

import main.everyday.RemoveDuplicatesFromSortedArrayII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    void test() {
        RemoveDuplicatesFromSortedArrayII arrayII = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(arrayII.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}