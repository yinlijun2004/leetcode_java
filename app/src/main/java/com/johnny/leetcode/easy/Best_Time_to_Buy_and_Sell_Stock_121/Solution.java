package com.johnny.leetcode.easy.Best_Time_to_Buy_and_Sell_Stock_121;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int ret = 0;
        for(int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            ret = Math.max(ret, prices[i] - min);
        }
        return ret;
    }
}