package test;

import main.everyday.MinimumNumberOfKConsecutiveBitFlips;
import org.junit.jupiter.api.Test;

class MinimumNumberOfKConsecutiveBitFlipsTest {

    @Test
    void test() {
        MinimumNumberOfKConsecutiveBitFlips flips = new MinimumNumberOfKConsecutiveBitFlips();
        System.out.println(flips.minKBitFlips(new int[]{0, 0, 0, 1, 0, 1, 1, 0}, 3));
    }
}