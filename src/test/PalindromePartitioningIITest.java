package test;

import main.everyday.PalindromePartitioningII;
import org.junit.jupiter.api.Test;

class PalindromePartitioningIITest {

    @Test
    void test(){
        PalindromePartitioningII palindromePartitioningII = new PalindromePartitioningII();
        System.out.println(palindromePartitioningII.minCut("ece"));
    }
}