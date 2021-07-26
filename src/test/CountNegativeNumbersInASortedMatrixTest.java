package test;

import main.tag.dichotomy.easy.CountNegativeNumbersInASortedMatrix;
import org.junit.jupiter.api.Test;

class CountNegativeNumbersInASortedMatrixTest {

    @Test
    void test() {
        CountNegativeNumbersInASortedMatrix matrix = new CountNegativeNumbersInASortedMatrix();
        System.out.println(matrix.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
    }
}