package test;

import main.Candy;
import org.junit.jupiter.api.Test;

class CandyTest {

    @Test
    void test() {
        Candy candy = new Candy();
        System.out.println(candy.candy(new int[]{1,2,87,87,87,2,1}));
    }
}