package test;

import main.everyday.BasicCalculator;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

    @Test
    void test(){
        BasicCalculator calculator = new BasicCalculator();
        System.out.println(calculator.calculate(" 2-1 + 2 "));
    }
}