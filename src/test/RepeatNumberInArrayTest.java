package test;

import main.offer.RepeatNumberInArray;
import org.junit.jupiter.api.Test;

class RepeatNumberInArrayTest {

    @Test
    void test() {
        RepeatNumberInArray numberInArray = new RepeatNumberInArray();
        System.out.println(numberInArray.findRepeatNumber2(new int[]{3, 1, 2, 3}));
    }
}