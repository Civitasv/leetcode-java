package test;

import main.everyday.SubarraysWithKDifferentIntegers;
import org.junit.jupiter.api.Test;

class SubarraysWithKDifferentIntegersTest {

    @Test
    void test() {
        SubarraysWithKDifferentIntegers integers = new SubarraysWithKDifferentIntegers();
        System.out.println(integers.subarraysWithKDistinct(new int[]{1, 2}, 1));
    }
}