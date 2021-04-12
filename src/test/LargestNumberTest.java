package test;

import main.everyday.LargestNumber;
import org.junit.jupiter.api.Test;

class LargestNumberTest {

    @Test
    void test() {
        LargestNumber number = new LargestNumber();
        System.out.println(number.largestNumber(new int[]{0, 0}));
    }
}