package test;

import main.CheckIfNAndItsDoubleExist;
import org.junit.jupiter.api.Test;

class CheckIfNAndItsDoubleExistTest {
    @Test
    void test() {
        CheckIfNAndItsDoubleExist exist = new CheckIfNAndItsDoubleExist();
        System.out.println(exist.checkIfExist(new int[]{7, 1, 14, 11}));
    }
}