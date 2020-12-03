package test;

import main.offer.SearchInTwoDimensionArray;
import org.junit.jupiter.api.Test;

class SearchInTwoDimensionArrayTest {
    @Test
    void test() {
        SearchInTwoDimensionArray array = new SearchInTwoDimensionArray();
        System.out.println(array.findNumberIn2DArray(new int[][]{}, 20));
    }
}