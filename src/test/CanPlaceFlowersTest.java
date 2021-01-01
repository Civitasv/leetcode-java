package test;

import main.everyday.CanPlaceFlowers;
import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

    @Test
    void test() {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
    }
}