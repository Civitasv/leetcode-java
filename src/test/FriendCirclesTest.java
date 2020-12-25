package test;

import main.FriendCircles;
import org.junit.jupiter.api.Test;

class FriendCirclesTest {

    @Test
    void test() {
        FriendCircles circles = new FriendCircles();
        System.out.println(circles.findCircleNum(new int[][]{{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}}));
    }
}