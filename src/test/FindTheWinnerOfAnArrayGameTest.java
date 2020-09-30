package test;

import main.FindTheWinnerOfAnArrayGame;
import org.junit.jupiter.api.Test;

class FindTheWinnerOfAnArrayGameTest {
    @Test
    void test() {
        FindTheWinnerOfAnArrayGame game = new FindTheWinnerOfAnArrayGame();
        int[] arr = {1,25,35,42,68,70};
        System.out.println(game.getWinner(arr, 6));
    }
}