package test;

import main.contest224.MaxMatrix;
import org.junit.jupiter.api.Test;

class MaxMatrixTest {

    @Test
    void test() {
        MaxMatrix matrix = new MaxMatrix();

        System.out.println(matrix.largestSubmatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}