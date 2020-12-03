package test;

import main.BasicCalculatorII;
import org.junit.jupiter.api.Test;

class BasicCalculatorIITest {

    @Test
    void test() {
        BasicCalculatorII basicCalculatorII = new BasicCalculatorII();
        System.out.println(basicCalculatorII.calculate("2+2/2"));
    }
}