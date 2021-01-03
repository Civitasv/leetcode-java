package test;

import main.contest222.BigMeal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BigMealTest {

    @Test
    void test() {
        BigMeal meal = new BigMeal();
        System.out.println(meal.countPairs(new int[]{2, 14, 11, 5, 1744, 2352, 0, 1, 1300, 2796, 0, 4, 376, 1672, 73, 55, 2006, 42, 10, 6, 0, 2, 2, 0, 0, 1, 0, 1, 0, 2, 271, 241, 1, 63, 1117, 931, 3, 5, 378, 646, 2, 0, 2, 0, 15, 1}));
    }
}