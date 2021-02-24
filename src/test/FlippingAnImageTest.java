package test;

import main.everyday.FlippingAnImage;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FlippingAnImageTest {

    @Test
    void test() {
        FlippingAnImage image = new FlippingAnImage();
        System.out.println(Arrays.deepToString(image.flipAndInvertImage(new int[][]{{1, 1, 0}})));
    }
}