package test;

import main.contest224.MaxRectangle;
import org.junit.jupiter.api.Test;

class MaxRectangleTest {

    @Test
    void test() {
        MaxRectangle maxRectangle = new MaxRectangle();
        System.out.println(maxRectangle.countGoodRectangles(new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}}));
    }
}