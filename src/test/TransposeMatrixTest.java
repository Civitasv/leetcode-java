package test;

import main.TransposeMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TransposeMatrixTest {

    @Test
    void test() {
        TransposeMatrix matrix = new TransposeMatrix();
        System.out.println(Arrays.deepToString(matrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
}