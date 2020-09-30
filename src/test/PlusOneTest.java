package test;


import main.PlusOne;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PlusOneTest {

    @Test
    void test() {
        PlusOne plusOne = new PlusOne();
        int[] test = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne.plusOne2(test)));
    }

}