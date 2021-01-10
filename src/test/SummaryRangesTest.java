package test;

import main.everyday.SummaryRanges;
import org.junit.jupiter.api.Test;

class SummaryRangesTest {

    @Test
    void test() {
        SummaryRanges ranges = new SummaryRanges();
        System.out.println(ranges.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}