package test;

import main.tag.dichotomy.easy.FindTheDistanceValueBetweenTwoArrays;
import org.junit.jupiter.api.Test;

class FindTheDistanceValueBetweenTwoArraysTest {

    @Test
    void test() {
        FindTheDistanceValueBetweenTwoArrays arrays = new FindTheDistanceValueBetweenTwoArrays();
        System.out.println(arrays.findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }
}