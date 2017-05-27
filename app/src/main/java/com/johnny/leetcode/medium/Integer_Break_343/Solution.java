package com.johnny.leetcode.medium.Integer_Break_343;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */
//https://leetcode.com/problems/integer-break/#/description

public class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;

        for(int i = 3; i < n + 1; i++) {
            if(i == 3) {
                dp[i] = 2;
                continue;
            }
            int max = 1;

            for(int j = 2; j < i - 1; j++) {
                int tmp = dp[i - j] * j;
                if(tmp > max) {
                    max = tmp;
                }
                tmp = (i - j) * j;
                if(tmp > max) {
                    max = tmp;
                }
            }
            dp[i] = max;
        }

        return dp[n];
    }
}
