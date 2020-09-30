package test;

import main.PowerOfThree;
import org.junit.jupiter.api.Test;

class PowerOfThreeTest {
    @Test
    void test() {
        PowerOfThree three = new PowerOfThree();
        System.out.println(three.isPowerOfThree(9));
    }
}