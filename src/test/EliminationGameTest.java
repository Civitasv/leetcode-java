package test;


import main.EliminationGame;
import org.junit.jupiter.api.Test;

class EliminationGameTest {

    @Test
    void test() {
        EliminationGame game = new EliminationGame();
        System.out.println(game.lastRemaining(12));
    }
}