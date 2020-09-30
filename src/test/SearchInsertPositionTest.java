package test;

import main.SearchInsertPosition;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    @Test
    public void test() {
        SearchInsertPosition position = new SearchInsertPosition();
        int[] nums = {1, 2, 4, 5, 6};
        System.out.println(position.searchInsert(nums, 3));
    }
}
