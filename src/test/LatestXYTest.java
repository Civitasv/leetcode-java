package test;

import main.contest47.LatestXY;
import org.junit.jupiter.api.Test;

class LatestXYTest {

    @Test
    void test() {
        LatestXY xy = new LatestXY();
        System.out.println(xy.nearestValidPoint(3, 4, new int[][]{{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}}));
    }
}