package test;


import main.TwoSumIIInputArrayIsSorted;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumIIInputArrayIsSortedTest {
    @Test
    void test() {
        TwoSumIIInputArrayIsSorted sorted = new TwoSumIIInputArrayIsSorted();
        int[] nums = {1, 2, 4, 5};
        System.out.println(Arrays.toString(sorted.twoSum(nums, 6)));
    }

}