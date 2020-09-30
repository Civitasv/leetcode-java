package test;

import main.ThreeSumClosest;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {
    @Test
    public void test() {
        ThreeSumClosest closest = new ThreeSumClosest();
        int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
        System.out.println(closest.threeSumClosest2(nums, 82));
    }
}
