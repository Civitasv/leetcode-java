package test;


import main.ValidPalindrome;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
    @Test
    void test() {
        ValidPalindrome palindrome = new ValidPalindrome();
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}