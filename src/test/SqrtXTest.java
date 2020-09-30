package test;


import main.SqrtX;
import org.junit.jupiter.api.Test;

class SqrtXTest {
    @Test
    public void test() {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt3(2147483647));
    }

}