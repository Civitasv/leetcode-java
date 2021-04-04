package test;


import main.everyday.LongestCommonSubsequence;
import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

    @Test
    void test() {
        LongestCommonSubsequence subsequence = new LongestCommonSubsequence();
        System.out.println(subsequence.longestCommonSubsequence("abcde", "ace"));
    }
}