package test;

import main.everyday.SearchInRotatedSortedArrayII;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayIITest {

    @Test
    void test() {
        SearchInRotatedSortedArrayII arrayII = new SearchInRotatedSortedArrayII();
        System.out.println(arrayII.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 6));
    }
}