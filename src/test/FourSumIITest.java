package test;

import main.everyday.FourSumII;
import org.junit.jupiter.api.Test;

class FourSumIITest {

    @Test
    void test() {
        FourSumII fourSumII = new FourSumII();
        System.out.println(fourSumII.fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2}));
    }
}