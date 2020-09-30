package test;

import main.PowerOfFour;
import org.junit.jupiter.api.Test;

class PowerOfFourTest {

    @Test
    void test() {
        PowerOfFour four = new PowerOfFour();
        System.out.println(four.isPowerOfFour(5));
    }
}