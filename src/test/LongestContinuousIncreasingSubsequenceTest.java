package test;

import main.everyday.LongestContinuousIncreasingSubsequence;
import org.junit.jupiter.api.Test;

class LongestContinuousIncreasingSubsequenceTest {

    @Test
    void test(){
        LongestContinuousIncreasingSubsequence subsequence = new LongestContinuousIncreasingSubsequence();
        System.out.println(subsequence.findLengthOfLCIS(new int[]{2,3}));
    }
}