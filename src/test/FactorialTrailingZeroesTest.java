package test;


import main.FactorialTrailingZeroes;
import org.junit.jupiter.api.Test;

class FactorialTrailingZeroesTest {

    @Test
    void test() {
        FactorialTrailingZeroes zeroes = new FactorialTrailingZeroes();
        System.out.println(zeroes.trailingZeroes(50));
    }

}