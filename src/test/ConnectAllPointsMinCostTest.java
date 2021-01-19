package test;

import main.everyday.ConnectAllPointsMinCost;
import org.junit.jupiter.api.Test;

class ConnectAllPointsMinCostTest {

    @Test
    void test() {
        ConnectAllPointsMinCost connectAllPointsMinCost = new ConnectAllPointsMinCost();
        System.out.println(connectAllPointsMinCost.minCostConnectPoints(new int[][]{{3, 12}, {-2, 5}, {-4, 1}}));
    }
}