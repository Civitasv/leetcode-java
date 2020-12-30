package test;

import main.everyday.LastStoneWeight;
import org.junit.jupiter.api.Test;

class LastStoneWeightTest {

    @Test
    void test(){
        LastStoneWeight stoneWeight = new LastStoneWeight();
        System.out.println(stoneWeight.lastStoneWeight2(new int[]{2,2}));
    }
}