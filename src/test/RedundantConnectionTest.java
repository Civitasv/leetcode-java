package test;

import main.everyday.RedundantConnection;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RedundantConnectionTest {

    @Test
    void test() {
        RedundantConnection connection = new RedundantConnection();
        System.out.println(Arrays.toString(connection.findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}})));
    }
}