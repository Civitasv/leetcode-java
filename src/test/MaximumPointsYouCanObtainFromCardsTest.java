package test;

import main.MaximumPointsYouCanObtainFromCards;
import org.junit.jupiter.api.Test;

class MaximumPointsYouCanObtainFromCardsTest {

    @Test
    void test() {
        MaximumPointsYouCanObtainFromCards cards = new MaximumPointsYouCanObtainFromCards();
        System.out.println(cards.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3));
    }
}