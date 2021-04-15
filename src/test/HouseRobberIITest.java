package test;

import main.everyday.HouseRobberII;
import org.junit.jupiter.api.Test;

class HouseRobberIITest {
    @Test
    void test(){
        HouseRobberII houseRobberII = new HouseRobberII();
        System.out.println(houseRobberII.rob(new int[]{1}));
    }
}