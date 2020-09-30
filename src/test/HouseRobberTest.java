package test;

import main.HouseRobber;
import org.junit.jupiter.api.Test;

class HouseRobberTest {
    @Test
    void test() {
        int[] nums = {2, 7, 9, 3, 1};
        HouseRobber robber = new HouseRobber();
        System.out.println(robber.rob2(nums));
    }
}