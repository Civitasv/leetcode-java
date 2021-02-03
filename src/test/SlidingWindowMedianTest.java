package test;

import main.SlidingWindowMedian;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SlidingWindowMedianTest {

    @Test
    void test() {
        SlidingWindowMedian median = new SlidingWindowMedian();
        System.out.println(Arrays.toString(median.medianSlidingWindow(new int[]{2147483647, 2147483647}, 2)));
    }
}