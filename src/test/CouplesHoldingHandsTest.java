package test;

import main.everyday.CouplesHoldingHands;
import org.junit.jupiter.api.Test;

class CouplesHoldingHandsTest {
    @Test
    void test() {
        CouplesHoldingHands holdingHands = new CouplesHoldingHands();
        System.out.println(holdingHands.minSwapsCouples(new int[]{0, 2, 1, 3}));
    }
}