package test;

import main.everyday.HIndex;
import org.junit.jupiter.api.Test;

class HIndexTest {

    @Test
    void test(){
        HIndex h = new HIndex();
        System.out.println(h.hIndex(new int[]{2,1}));
    }
}