package test;

import main.MakeTwoArraysEqualByReversingSubArrays;
import org.junit.jupiter.api.Test;

class MakeTwoArraysEqualByReversingSubArraysTest {
    @Test
    void test() {
        MakeTwoArraysEqualByReversingSubArrays subArrays = new MakeTwoArraysEqualByReversingSubArrays();
        System.out.println(subArrays.canBeEqual(new int[]{1, 2, 4, 3}, new int[]{2, 4, 1, 3}));
    }
}