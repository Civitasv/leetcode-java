package test;

import main.everyday.ToeplitzMatrix;
import org.junit.jupiter.api.Test;

class ToeplitzMatrixTest {

    @Test
    void test() {
        ToeplitzMatrix matrix = new ToeplitzMatrix();
        System.out.println(matrix.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }
}