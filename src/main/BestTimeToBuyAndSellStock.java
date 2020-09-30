package main;

public class BestTimeToBuyAndSellStock {
    /**
     * Title: Best Time to Buy and Sell Stock
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * If you were only permitted to complete at most one transaction
     * (i.e., buy one and sell one share of the stock),
     * design an algorithm to find the maximum profit.
     * <p>
     * Note that you cannot sell a stock before you buy one.
     *
     * @param prices
     * @return maxProfit
     */
    public int maxProfit(int[] prices) {

        // method one
        /*int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                max = prices[j] - prices[i] > max ? prices[j] - prices[i] : max;
            }
        }
        return max;*/
        // method two
        int minprice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > max) {
                max = prices[i] - minprice;
            }
        }
        return max;
    }

    /**
     * Title: Best Time to Buy and Sell Stock II
     * Say you have an array prices for which the ith element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit.
     * <p>
     * You may complete as many transactions as you like
     * (i.e., buy one and sell one share of the stock multiple times).
     * <p>
     * You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
     *
     * @param prices
     * @return maxProfit
     */
    // 暴力破解
    public int maxProfit2(int[] prices) {
        return calculate2(prices, 0);
    }

    public int calculate2(int[] prices, int start) {
        if (prices.length < start)
            return 0;
        int max = 0;
        for (int i = start; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int cal = prices[j] - prices[i] + calculate2(prices, j + 1);
                    max = cal > max ? cal : max;
                }
            }
        }
        return max;
    }

    // 十分简单的方法 画图法
    public int _maxProfit2_(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }


    /**
     * Best Time to Buy and Sell Stock III
     * <p>
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit. You may complete at most two transactions.
     * <p>
     * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
     *
     * @param prices
     * @return
     */
    public int maxProfit3(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    int cal = prices[j] - prices[i] + calculate3(prices, j + 1);
                    max = cal > max ? cal : max;
                }
            }
        }
        return max;
    }

    // 一次通信，最大值
    public int calculate3(int[] prices, int start) {
        int minprice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = start; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > max) {
                max = prices[i] - minprice;
            }
        }
        return max;
    }

    /**
     * Say you have an array for which the i-th element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit. You may complete at most k transactions.
     * <p>
     * Note:
     * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
     *
     * @param k
     * @param prices
     * @return
     */
    // DP算法
    public int maxProfit4(int k, int[] prices) {
        int len = prices.length;
        if (k >= len / 2) return quickSolve(prices);

        int[][] t = new int[k + 1][len];
        for (int i = 1; i <= k; i++) {
            int tmpMax = -prices[0];
            for (int j = 1; j < len; j++) {
                t[i][j] = Math.max(t[i][j - 1], prices[j] + tmpMax);
                tmpMax = Math.max(tmpMax, t[i - 1][j - 1] - prices[j]);
            }
        }
        return t[k][len - 1];
    }


    private int quickSolve(int[] prices) {
        int len = prices.length, profit = 0;
        for (int i = 1; i < len; i++)
            // as long as there is a price gap, we gain a profit.
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        return profit;
    }
}