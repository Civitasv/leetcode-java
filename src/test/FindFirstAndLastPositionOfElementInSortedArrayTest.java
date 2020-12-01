package test;

import main.everyday.FindFirstAndLastPositionOfElementInSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void test() {
        FindFirstAndLastPositionOfElementInSortedArray andLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        System.out.println(Arrays.toString(andLastPositionOfElementInSortedArray.searchRange2(new int[]{5, 7, 7, 8, 8, 8, 10}, 8)));
    }

}