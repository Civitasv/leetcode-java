package test;

import main.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionOfTwoArraysTest {

    @Test
    void test() {
        IntersectionOfTwoArrays arrays = new IntersectionOfTwoArrays();
        System.out.println(Arrays.toString(arrays.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}