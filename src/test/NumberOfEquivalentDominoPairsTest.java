package test;

import main.everyday.NumberOfEquivalentDominoPairs;
import org.junit.jupiter.api.Test;

class NumberOfEquivalentDominoPairsTest {

    @Test
    void test() {
        NumberOfEquivalentDominoPairs pairs = new NumberOfEquivalentDominoPairs();
        System.out.println(pairs.numEquivDominoPairs(new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
    }
}