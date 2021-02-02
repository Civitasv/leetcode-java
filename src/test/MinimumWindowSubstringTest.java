package test;

import main.MinimumWindowSubstring;
import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {

    @Test
    void test() {
        MinimumWindowSubstring substring = new MinimumWindowSubstring();
        System.out.println(substring.minWindow("ADOBECODEBANC", "ABC"));
    }
}