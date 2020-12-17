package main.everyday;

/**
 * 买卖股票的最佳时机含手续费
 * <p>
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 * <p>
 * 你可以尽可能多的地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 * <p>
 * 返回获得利润的最大值。
 * <p>
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] dp = new int[n]; // dp[ｉ]表示第ｉ天手上有股票时的的股票净利润值
        int[] dp2 = new int[n]; // dp2[ｉ]表示第ｉ天手上没有股票时的的股票净利润值
        dp[0] = -prices[0];
        dp2[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp[i - 1] + prices[i] - fee); // 卖出
            dp[i] = Math.max(dp[i - 1], dp2[i - 1] - prices[i]); // 买入
        }
        return dp2[n - 1];
    }
}
