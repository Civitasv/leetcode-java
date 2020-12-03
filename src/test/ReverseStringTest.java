package test;


import main.ReverseString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReverseStringTest {
    @Test
    void test() {
        ReverseString reverseString = new ReverseString();
        char [] arr = "12345".toCharArray();
        reverseString.reverseString(arr);
        System.out.println(arr);
    }
}