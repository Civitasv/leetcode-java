package test;

import main.everyday.SearchA2DMatrix;
import org.junit.jupiter.api.Test;

class SearchA2DMatrixTest {

    @Test
    void test() {
        SearchA2DMatrix matrix = new SearchA2DMatrix();
        System.out.println(matrix.searchMatrix(new int[][]{{1}}, 13));
    }
}