package test;

import main.RevealCardsInIncreasingOrder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void test(){
        RevealCardsInIncreasingOrder test = new RevealCardsInIncreasingOrder();
        int [] deck = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(test.deckRevealedIncreasing(deck)));
    }
}
