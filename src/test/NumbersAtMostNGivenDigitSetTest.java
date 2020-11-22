package test;

import main.NumbersAtMostNGivenDigitSet;
import org.junit.jupiter.api.Test;

class NumbersAtMostNGivenDigitSetTest {

    @Test
    void test() {
        NumbersAtMostNGivenDigitSet set = new NumbersAtMostNGivenDigitSet();
        System.out.println(set.length(100));
        System.out.println(set.A(4, 2));
        System.out.println(set.C(4, 2));
    }
}