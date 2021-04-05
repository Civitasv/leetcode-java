package test;

import main.everyday.RabbitsInForest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RabbitsInForestTest {

    @Test
    void test(){
        RabbitsInForest forest = new RabbitsInForest();
        System.out.println(forest.numRabbits(new int[]{1, 1, 2}));
    }
}