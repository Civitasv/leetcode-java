package test;

import main.ArrayNesting;
import org.junit.jupiter.api.Test;

class ArrayNestingTest {

    @Test
    void test() {
        ArrayNesting arrayNesting = new ArrayNesting();
        System.out.println(arrayNesting.arrayNesting(new int[]{1, 0, 3, 4, 2}));
    }
}