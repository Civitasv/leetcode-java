package test;

import main.everyday.LargestDivisibleSubset;
import org.junit.jupiter.api.Test;

class LargestDivisibleSubsetTest {
    @Test
    void test() {
        LargestDivisibleSubset subset = new LargestDivisibleSubset();
        System.out.println(subset.largestDivisibleSubset(new int[]{1, 2, 4, 8}));
    }
}