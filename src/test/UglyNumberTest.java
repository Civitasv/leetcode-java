package test;

import main.everyday.UglyNumber;
import org.junit.jupiter.api.Test;

class UglyNumberTest {

    @Test
    void test(){
        UglyNumber number = new UglyNumber();
        System.out.println(number.isUgly(-5));
    }
}