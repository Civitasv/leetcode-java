package test;


import main.everyday.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {
    @Test
    void test() {
        MaxConsecutiveOnes consecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(consecutiveOnes.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}