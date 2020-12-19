package test;

import main.everyday.RotateImage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateImageTest {

    @Test
    void test() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{{1}};
        rotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}