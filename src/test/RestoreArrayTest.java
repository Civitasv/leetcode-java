package test;

import main.contest226.RestoreArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RestoreArrayTest {

    @Test
    void test() {
        RestoreArray array = new RestoreArray();
        System.out.println(Arrays.toString(array.restoreArray(new int[][]{{4, -2}, {1, 4}, {-3, 1}})));
    }
}