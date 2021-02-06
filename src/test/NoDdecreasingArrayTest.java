package test;

import main.everyday.NoDdecreasingArray;
import org.junit.jupiter.api.Test;

class NoDdecreasingArrayTest {

    @Test
    void test() {
        NoDdecreasingArray array = new NoDdecreasingArray();
        System.out.println(array.checkPossibility(new int[]{4, 2, 3}));
    }
}