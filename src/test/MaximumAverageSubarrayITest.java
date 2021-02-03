package test;

import main.everyday.MaximumAverageSubarrayI;
import org.junit.jupiter.api.Test;

class MaximumAverageSubarrayITest {
    @Test
    void test() {
        MaximumAverageSubarrayI subarrayI = new MaximumAverageSubarrayI();
        System.out.println(subarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }
}