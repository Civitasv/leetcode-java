package test;

import main.everyday.MatrixCore;
import org.junit.jupiter.api.Test;

class MatrixCoreTest {

    @Test
    void test() {
        MatrixCore matrixCore = new MatrixCore();
        System.out.println(matrixCore.matrixScore(new int[][]{{0, 1}, {1, 1}}));
    }
}