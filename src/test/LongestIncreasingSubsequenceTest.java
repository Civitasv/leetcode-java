package test;

import main.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {
    @Test
    void test() {
        LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
        System.out.println(subsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}