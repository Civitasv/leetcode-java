package test;

import main.everyday.MonotoneIncreasingDigits;
import org.junit.jupiter.api.Test;

class MonotoneIncreasingDigitsTest {
    @Test
    void test(){
        MonotoneIncreasingDigits digits = new MonotoneIncreasingDigits();
        System.out.println(digits.monotoneIncreasingDigits(100));
    }
}