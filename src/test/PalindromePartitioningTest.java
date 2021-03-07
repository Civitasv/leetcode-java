package test;

import main.everyday.PalindromePartitioning;
import org.junit.jupiter.api.Test;

class PalindromePartitioningTest {

    @Test
    void test(){
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
        System.out.println(palindromePartitioning.partition("aab")
        );
    }
}