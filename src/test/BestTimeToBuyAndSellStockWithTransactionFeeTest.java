package test;


import main.everyday.BestTimeToBuyAndSellStockWithTransactionFee;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    void test() {
        BestTimeToBuyAndSellStockWithTransactionFee stock = new BestTimeToBuyAndSellStockWithTransactionFee();
        System.out.println(stock.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}