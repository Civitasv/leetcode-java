package test;

import main.everyday.FindAllNumbersDisappearedInAnArray;
import org.junit.jupiter.api.Test;

class FindAllNumbersDisappearedInAnArrayTest {
    @Test
    void test() {
        FindAllNumbersDisappearedInAnArray array = new FindAllNumbersDisappearedInAnArray();
        System.out.println(array.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}