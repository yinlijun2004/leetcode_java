package com.johnny.leetcode.easy.Best_Time_to_Buy_and_Sell_Stock_II;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/#/description

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i + 1] >= prices[i]) {
                profit = profit + prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
