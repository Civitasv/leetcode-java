package test;

import main.IntersectionOfTwoArraysII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionOfTwoArraysIITest {

    @Test
    void test() {
        IntersectionOfTwoArraysII arraysII = new IntersectionOfTwoArraysII();
        System.out.println(Arrays.toString(arraysII.intersect(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}