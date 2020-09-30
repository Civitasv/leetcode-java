package test;

import main.LongestPalindrome;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {

    @Test
    void test(){
        LongestPalindrome palindrome = new LongestPalindrome();
        System.out.println(palindrome.longestPalindrome("abccccdd"));
    }
}