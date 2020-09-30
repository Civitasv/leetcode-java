package test;

import main.CountGoodTriplets;
import org.junit.jupiter.api.Test;

class CountGoodTripletsTest {
    @Test
    void test() {
        CountGoodTriplets triplets = new CountGoodTriplets();
        int[] arr = {3, 0, 1, 1, 9, 7};
        System.out.println(triplets.countGoodTriplets(arr, 7, 2, 3));
    }
}