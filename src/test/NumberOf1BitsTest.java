package test;

import main.NumberOf1Bits;
import org.junit.jupiter.api.Test;

class NumberOf1BitsTest {
    @Test
    void test() {
        NumberOf1Bits bits = new NumberOf1Bits();
        System.out.println(bits.hammingWeight(-3));
    }
}