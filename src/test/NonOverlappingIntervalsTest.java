package test;

import main.NonOverlappingIntervals;
import org.junit.jupiter.api.Test;

class NonOverlappingIntervalsTest {

    @Test
    void test() {
        NonOverlappingIntervals intervals = new NonOverlappingIntervals();
        int[][] interval = {{1, 100}, {11, 22}, {1, 11}, {2, 12}};
        System.out.println(intervals.eraseOverlapIntervals(interval));
    }
}