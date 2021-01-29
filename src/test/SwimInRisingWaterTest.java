package test;

import main.everyday.SwimInRisingWater;
import org.junit.jupiter.api.Test;

class SwimInRisingWaterTest {

    @Test
    void test() {
        SwimInRisingWater water = new SwimInRisingWater();
        System.out.println(water.swimInWater(new int[][]{{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}}));
    }
}