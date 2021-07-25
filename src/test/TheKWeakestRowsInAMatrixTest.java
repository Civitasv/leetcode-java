package test;

import main.tag.dichotomy.easy.TheKWeakestRowsInAMatrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TheKWeakestRowsInAMatrixTest {

    @Test
    void test(){
        TheKWeakestRowsInAMatrix weakestRowsInAMatrix = new TheKWeakestRowsInAMatrix();
        System.out.println(Arrays.toString(weakestRowsInAMatrix.kWeakestRows(new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}}, 3)));
    }
}