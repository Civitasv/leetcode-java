package test;

import main.everyday.NumArray;
import org.junit.jupiter.api.Test;

class NumArrayTest {

    @Test
    void test() {
        NumArray array = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(array.sumRange(0, 2));
        System.out.println(array.sumRange(2, 5));
        System.out.println(array.sumRange(0, 5));
    }
}