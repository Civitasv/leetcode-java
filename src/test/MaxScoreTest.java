package test;

import main.contest220.MaxScore;
import org.junit.jupiter.api.Test;

class MaxScoreTest {

    @Test
    void test() {
        MaxScore maxScore = new MaxScore();
        System.out.println(maxScore.maximumUniqueSubarray(new int[]{10000,1,10000,1,1,1,1,1,1}));
    }
}