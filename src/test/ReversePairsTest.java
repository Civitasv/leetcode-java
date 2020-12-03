package test;

import main.everyday.ReversePairs;
import org.junit.jupiter.api.Test;

class ReversePairsTest {

    @Test
    void test() {
        ReversePairs pairs = new ReversePairs();
        System.out.println(pairs.reversePairs(new int[]{2, 4, 3, 5, 1}));
    }
}