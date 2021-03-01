package test;

import main.everyday.NumMatrix;
import org.junit.jupiter.api.Test;

class NumMatrixTest {

    @Test
    void test() {
        NumMatrix matrix = new NumMatrix(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}});
        System.out.println(matrix.sumRegion(2, 1, 4, 3));
    }
}