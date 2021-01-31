package test;

import main.contest226.MaxBalls;
import org.junit.jupiter.api.Test;

class MaxBallsTest {

    @Test
    void test(){
        MaxBalls balls = new MaxBalls();
        System.out.println(balls.countBalls(1,10));
    }
}