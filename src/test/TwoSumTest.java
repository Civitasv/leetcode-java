package test;

import main.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    @Test
    void test() {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}