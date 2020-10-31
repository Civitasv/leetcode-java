package test;

import main.BinarySearch;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void test() {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
    }
}