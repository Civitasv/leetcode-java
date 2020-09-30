package test;

import main.PowerOfTwo;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {
    @Test
    void test() {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOfTwo(5));
        System.out.println(powerOfTwo.isPowerOfTwo(218));
        System.out.println(powerOfTwo.isPowerOfTwo(128));
    }
}