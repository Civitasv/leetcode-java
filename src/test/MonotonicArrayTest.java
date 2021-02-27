package test;

import main.everyday.MonotonicArray;
import org.junit.jupiter.api.Test;

class MonotonicArrayTest {
    @Test
    void test() {
        MonotonicArray array = new MonotonicArray();
        System.out.println(array.isMonotonic(new int[]{1, 1, 0}));
    }
}