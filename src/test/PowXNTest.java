package test;

import main.PowXN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowXNTest {

    @Test
    void test() {
        PowXN powXN = new PowXN();
        System.out.println(powXN.myPow(2, 10));
        System.out.println(-2147483648 == Integer.MIN_VALUE);

    }
}