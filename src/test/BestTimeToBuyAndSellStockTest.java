package test;

import main.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;


public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int[] profit = {6,1,3,2,4,7};
        System.out.println(solution.maxProfit4(2,profit));
    }
}
