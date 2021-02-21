package test;

import main.everyday.LongestContinuousSubarray;
import org.junit.jupiter.api.Test;

class LongestContinuousSubarrayTest {

    @Test
    void test() {
        LongestContinuousSubarray subarray = new LongestContinuousSubarray();
        System.out.println(subarray.longestSubarray(new int[]{8, 2, 4, 7}, 4));
    }
}