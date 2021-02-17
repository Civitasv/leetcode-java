package test;

import main.everyday.ReshapeTheMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReshapeTheMatrixTest {

    @Test
    void test() {
        ReshapeTheMatrix matrix = new ReshapeTheMatrix();
        System.out.println(Arrays.deepToString(matrix.matrixReshape(new int[][]{{1, 2, 3, 4}}, 2, 2)));
    }

}