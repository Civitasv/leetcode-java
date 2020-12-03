package test;

import main.ValidMountainArray;
import org.junit.jupiter.api.Test;

class ValidMountainArrayTest {

    @Test
    void test() {
        ValidMountainArray mountainArray = new ValidMountainArray();
        System.out.println(mountainArray.validMountainArray(new int[]{3, 2, 1}));
    }
}