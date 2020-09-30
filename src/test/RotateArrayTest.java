package test;

import main.RotateArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArrayTest {

    @Test
    void test() {
        RotateArray array = new RotateArray();
        int[] nums = {1, 2};
        array.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}