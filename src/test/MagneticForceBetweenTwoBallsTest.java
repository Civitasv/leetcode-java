package test;

import main.MagneticForceBetweenTwoBalls;
import org.junit.jupiter.api.Test;

class MagneticForceBetweenTwoBallsTest {

    @Test
    void test() {
        MagneticForceBetweenTwoBalls balls = new MagneticForceBetweenTwoBalls();
        System.out.println(balls.maxDistance(new int[]{82, 68, 79, 17, 70, 51, 5, 46, 27, 44, 39, 57, 94, 45, 88, 56}, 9));
    }
}