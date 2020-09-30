package test;


import main.SingleNumber;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

    @Test
    void test() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {2, 2, 4};
        System.out.println(singleNumber.singleNumber(nums));
    }
}