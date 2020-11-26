package test;

import main.everyday.MaximumGap;
import org.junit.jupiter.api.Test;

class MaximumGapTest {

    @Test
    void test() {
        MaximumGap gap = new MaximumGap();
        System.out.println(gap.maximumGap(new int[]{1, 10000000}));
    }
}