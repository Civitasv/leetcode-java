package test;

import main.contest219.PebbleGame;
import org.junit.jupiter.api.Test;

class PebbleGameTest {

    @Test
    void test() {
        PebbleGame pebbleGame = new PebbleGame();
        System.out.println(pebbleGame.stoneGameVII(new int[]{5, 3, 1, 4, 2}));
    }
}