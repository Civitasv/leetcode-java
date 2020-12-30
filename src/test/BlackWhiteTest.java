package test;

import main.BlackWhite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackWhiteTest {

    @Test
    void test() {
        BlackWhite blackWhite = new BlackWhite();
        System.out.println(blackWhite.paintingPlan(5, 23));
    }
}