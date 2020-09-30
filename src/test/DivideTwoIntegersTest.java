package test;

import main.DivideTwoIntegers;
import org.junit.jupiter.api.Test;

class DivideTwoIntegersTest {
    @Test
    void test() {
        DivideTwoIntegers integers = new DivideTwoIntegers();
        System.out.println(integers.divide(-2147483648, 2));
    }
}