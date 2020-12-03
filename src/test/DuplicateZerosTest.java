package test;

import main.DuplicateZeros;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DuplicateZerosTest {
    @Test
    void test() {
        DuplicateZeros zeros = new DuplicateZeros();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        zeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}