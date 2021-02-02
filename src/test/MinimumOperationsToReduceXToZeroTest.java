package test;

import main.MinimumOperationsToReduceXToZero;
import org.junit.jupiter.api.Test;

class MinimumOperationsToReduceXToZeroTest {

    @Test
    void test() {
        MinimumOperationsToReduceXToZero zero = new MinimumOperationsToReduceXToZero();
        System.out.println(zero.minOperations(new int[]{1, 1}, 3));
    }
}