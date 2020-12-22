package test;

import main.ReversePair;
import org.junit.jupiter.api.Test;

class ReversePairTest {

    @Test
    void test() {
        ReversePair pair = new ReversePair();
        System.out.println(pair.reversePairs(new int[]{1, 3, 2, 3, 1}));
    }
}