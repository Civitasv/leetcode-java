package test;

import main.everyday.DegreeOfAnArray;
import org.junit.jupiter.api.Test;

class DegreeOfAnArrayTest {

    @Test
    void test(){
        DegreeOfAnArray array = new DegreeOfAnArray();
        System.out.println(array.findShortestSubArray(new int[]{1}));
    }
}