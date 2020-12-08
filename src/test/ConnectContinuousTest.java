package test;

import main.contest218.ConnectContinuous;
import org.junit.jupiter.api.Test;

class ConnectContinuousTest {

    @Test
    void test() {
        ConnectContinuous connectContinuous = new ConnectContinuous();
        System.out.println(connectContinuous.concatenatedBinary(100000));
    }
}