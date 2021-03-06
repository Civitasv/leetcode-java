package test;

import main.contest47.IsThreePow;
import org.junit.jupiter.api.Test;

class IsThreePowTest {

    @Test
    void test(){
        IsThreePow pow = new IsThreePow();
        System.out.println(pow.checkPowersOfThree(11));
    }
}