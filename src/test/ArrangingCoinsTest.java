package test;

import main.tag.dichotomy.easy.ArrangingCoins;
import org.junit.jupiter.api.Test;

class ArrangingCoinsTest {

    @Test
    void test(){
        ArrangingCoins coins = new ArrangingCoins();
        System.out.println(coins.arrangeCoins(1804289383));
    }
}