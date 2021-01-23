package test;

import main.everyday.NumberOfOperationsToMakeNetworkConnected;
import org.junit.jupiter.api.Test;

class NumberOfOperationsToMakeNetworkConnectedTest {

    @Test
    void test() {
        NumberOfOperationsToMakeNetworkConnected connected = new NumberOfOperationsToMakeNetworkConnected();
        System.out.println(connected.makeConnected(10, new int[][]{{0, 4}, {1, 6}, {2, 9}, {4, 7}, {0, 6}, {6, 9}, {4, 8}, {1, 4}, {4, 9}, {1, 8}, {2, 8}, {3, 4}, {0, 9}}));
    }
}