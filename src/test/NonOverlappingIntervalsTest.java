package test;

import main.everyday.NonOverlappingIntervals;
import org.junit.jupiter.api.Test;

class NonOverlappingIntervalsTest {

    @Test
    void test() {
        NonOverlappingIntervals intervals = new NonOverlappingIntervals();
        int[][] interval = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println(intervals.eraseOverlapIntervals(interval));
    }
}