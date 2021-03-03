package test;

import main.everyday.MoveZeroes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MoveZeroesTest {

    @Test
    void test() {
        MoveZeroes zeroes = new MoveZeroes();
        int[] res = new int[]{0, 1, 0, 3, 12};
        zeroes.moveZeroes(res);
        System.out.println(Arrays.toString(res));
    }
}