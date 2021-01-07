package test;

import main.everyday.NumberOfProvinces;
import org.junit.jupiter.api.Test;

class NumberOfProvincesTest {

    @Test
    void test() {
        NumberOfProvinces provinces = new NumberOfProvinces();
        System.out.println(provinces.findCircleNum(new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}}));
    }
}