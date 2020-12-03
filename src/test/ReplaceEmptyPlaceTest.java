package test;

import main.offer.ReplaceEmptyPlace;
import org.junit.jupiter.api.Test;

class ReplaceEmptyPlaceTest {

    @Test
    void test() {
        ReplaceEmptyPlace emptyPlace = new ReplaceEmptyPlace();
        System.out.println(emptyPlace.replaceSpace("I love you"));
    }
}