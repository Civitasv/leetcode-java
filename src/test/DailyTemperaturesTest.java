package test;


import main.everyday.DailyTemperatures;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DailyTemperaturesTest {

    @Test
    void test() {
        DailyTemperatures temperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(temperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}