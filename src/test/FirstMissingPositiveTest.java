package test;

import main.FirstMissingPositive;
import org.junit.jupiter.api.Test;

class FirstMissingPositiveTest {

    @Test
    void test() {
        FirstMissingPositive positive = new FirstMissingPositive();
        System.out.println(positive.firstMissingPositive(new int[]{3,4,-1,1}));
    }
}