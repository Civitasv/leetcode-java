package test;

import main.everyday.FindPivotIndex;
import org.junit.jupiter.api.Test;

class FindPivotIndexTest {

    @Test
    void test() {
        FindPivotIndex index = new FindPivotIndex();
        System.out.println(index.pivotIndex(new int[]{1, 2, 3}));
    }
}