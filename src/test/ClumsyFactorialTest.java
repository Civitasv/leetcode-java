package test;

import main.everyday.ClumsyFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClumsyFactorialTest {

    @Test
    void test() {
        ClumsyFactorial factorial = new ClumsyFactorial();
        System.out.println(factorial.clumsy(8));
    }
}