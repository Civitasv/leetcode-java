package test;

import main.everyday.LongestTurbulentSubarray;
import org.junit.jupiter.api.Test;

class LongestTurbulentSubarrayTest {

    @Test
    void test() {
        LongestTurbulentSubarray subarray = new LongestTurbulentSubarray();
        System.out.println(subarray.maxTurbulenceSize(new int[]{0, 8, 45, 88, 48, 68, 28, 55, 17, 24}));
    }
}