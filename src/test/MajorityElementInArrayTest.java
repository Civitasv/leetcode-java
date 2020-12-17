package test;

import main.offer.MajorityElementInArray;
import org.junit.jupiter.api.Test;

class MajorityElementInArrayTest {

    @Test
    void test(){
        MajorityElementInArray majorityElementInArray = new MajorityElementInArray();
        System.out.println(majorityElementInArray.majority(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}