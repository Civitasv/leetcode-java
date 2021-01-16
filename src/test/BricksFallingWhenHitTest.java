package test;

import main.everyday.BricksFallingWhenHit;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BricksFallingWhenHitTest {

    @Test
    void test() {
        BricksFallingWhenHit hit = new BricksFallingWhenHit();
        System.out.println(Arrays.toString(hit.hitBricks(new int[][]{{1, 0, 0, 0}, {1, 1, 1, 0}}, new int[][]{{1, 0}})));
    }
}