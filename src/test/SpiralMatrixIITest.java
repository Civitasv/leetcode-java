package test;

import main.everyday.SpiralMatrixII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SpiralMatrixIITest {

    @Test
    void test() {
        SpiralMatrixII matrixII = new SpiralMatrixII();
        System.out.println(Arrays.deepToString(matrixII.generateMatrix(1)));
    }
}