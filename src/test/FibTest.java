package test;

import main.offer.Fib;
import org.junit.jupiter.api.Test;

class FibTest {
    @Test
    void test() {
        Fib fib = new Fib();
        System.out.println(fib.fib(41));
    }
}