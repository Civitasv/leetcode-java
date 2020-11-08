package test;

import main.SquaresOfASortedArraySolution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SquaresOfASortedArraySolutionTest {

    @Test
    void test() {
        SquaresOfASortedArraySolution squaresOfASortedArraySolution = new SquaresOfASortedArraySolution();
        System.out.println(Arrays.toString(squaresOfASortedArraySolution.sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}