package test;

import main.everyday.MaxConsecutiveOnesIII;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesIIITest {

    @Test
    void test() {
        MaxConsecutiveOnesIII onesIII = new MaxConsecutiveOnesIII();
        System.out.println(onesIII.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }
}