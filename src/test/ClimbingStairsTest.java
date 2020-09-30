package test;


import main.ClimbingStairs;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    public void test() {
        ClimbingStairs stairs = new ClimbingStairs();
        System.out.println(stairs.climbStairs4(5));
    }
}