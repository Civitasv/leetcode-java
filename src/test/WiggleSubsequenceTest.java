package test;


import main.everyday.WiggleSubsequence;
import org.junit.jupiter.api.Test;

class WiggleSubsequenceTest {

    @Test
    void test(){
        WiggleSubsequence subsequence = new WiggleSubsequence();
        System.out.println(subsequence.wiggleMaxLength(new int[]{1,2,2,1}));
    }
}