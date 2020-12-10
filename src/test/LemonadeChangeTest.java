package test;


import main.everyday.LemonadeChange;
import org.junit.jupiter.api.Test;

class LemonadeChangeTest {

    @Test
    void test() {
        LemonadeChange change = new LemonadeChange();
        System.out.println(change.lemonadeChange(new int[]{5, 5, 5, 5, 20, 20, 20, 20, 5, 5, 5, 5}));
    }
}