package test;


import main.everyday.BinaryPrefixDivisibleBy5;
import org.junit.jupiter.api.Test;

class BinaryPrefixDivisibleBy5Test {

    @Test
    void test() {
        BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5 = new BinaryPrefixDivisibleBy5();
        System.out.println(binaryPrefixDivisibleBy5.prefixesDivBy5(new int[]{0, 1, 1, 1, 1, 1}));
    }
}