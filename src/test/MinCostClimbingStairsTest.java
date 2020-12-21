package test;

import main.everyday.MinCostClimbingStairs;
import org.junit.jupiter.api.Test;

class MinCostClimbingStairsTest {

    @Test
    void test() {
        MinCostClimbingStairs costClimbingStairs = new MinCostClimbingStairs();
        System.out.println(costClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
    }
}