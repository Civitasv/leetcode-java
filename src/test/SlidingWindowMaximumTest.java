package test;

import main.everyday.SlidingWindowMaximum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SlidingWindowMaximumTest {

    @Test
    void test() {
        SlidingWindowMaximum maximum = new SlidingWindowMaximum();
        System.out.println(Arrays.toString(maximum.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}