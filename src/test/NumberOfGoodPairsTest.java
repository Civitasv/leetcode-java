package test;

import main.NumberOfGoodPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {
    @Test
    void test() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        int[] nums = {};
        System.out.println(goodPairs.numIdenticalPairs(nums));
    }
}