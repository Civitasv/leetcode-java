package test;

import main.FindAllDuplicatesInAnArray;
import org.junit.jupiter.api.Test;

class FindAllDuplicatesInAnArrayTest {

    @Test
    void test() {
        FindAllDuplicatesInAnArray allDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(allDuplicatesInAnArray.findDuplicates2(nums));
    }
}