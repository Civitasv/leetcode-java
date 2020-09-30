package test;

import main.HappyNumber;
import org.junit.jupiter.api.Test;

class HappyNumberTest {
    @Test
    void test(){
        HappyNumber number = new HappyNumber();
        System.out.println(number.isHappy(21));
    }
}