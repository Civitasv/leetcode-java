package test;

import main.offer.LeastKey;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LeastKeyTest {

    @Test
    void test() {
        LeastKey leastKey = new LeastKey();
        System.out.println(Arrays.toString(leastKey.getLeastNumbers2(new int[]{0, 1, 1, 2, 4, 4, 1, 3, 3, 2}, 6)));
    }
}