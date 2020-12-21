package test;

import main.MinimumSwapsToMakeSequencesIncreasing;
import org.junit.jupiter.api.Test;

class MinimumSwapsToMakeSequencesIncreasingTest {

    @Test
    void test() {
        MinimumSwapsToMakeSequencesIncreasing minimumSwapsToMakeSequencesIncreasing = new MinimumSwapsToMakeSequencesIncreasing();
        System.out.println(minimumSwapsToMakeSequencesIncreasing.minSwap(new int[]{1, 3, 5, 4}, new int[]{1, 2, 3, 7}));
    }
}