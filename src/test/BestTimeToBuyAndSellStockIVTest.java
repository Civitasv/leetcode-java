package test;

import main.everyday.BestTimeToBuyAndSellStockIV;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockIVTest {


    @Test
    void test() {
        BestTimeToBuyAndSellStockIV bestTimeToBuyAndSellStockIV = new BestTimeToBuyAndSellStockIV();
        System.out.println(bestTimeToBuyAndSellStockIV.maxProfit(2, new int[]{2, 1, 4, 5, 2, 9, 7}));
    }
}