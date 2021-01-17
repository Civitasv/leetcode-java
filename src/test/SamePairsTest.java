package test;

import main.contest224.SamePairs;
import org.junit.jupiter.api.Test;

class SamePairsTest {

    @Test
    void test(){
        SamePairs samePairs = new SamePairs();
        System.out.println(samePairs.tupleSameProduct(new int[]{2,3,4,6}));
    }
}