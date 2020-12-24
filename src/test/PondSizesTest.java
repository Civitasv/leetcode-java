package test;

import main.PondSizes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PondSizesTest {

    @Test
    void test() {
        PondSizes sizes = new PondSizes();
        System.out.println(Arrays.toString(sizes.pondSizes(new int[][]{{1, 0, 1, 1, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 0, 0, 0}})));
    }
}