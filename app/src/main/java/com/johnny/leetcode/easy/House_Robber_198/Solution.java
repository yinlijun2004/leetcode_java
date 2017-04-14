package com.johnny.leetcode.easy.House_Robber_198;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/house-robber/#/description

public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(i == 1) {
                dp[i] = Math.max(dp[0], nums[i]);
                continue;
            }
            if(dp[i - 2] + nums[i] > dp[i - 1]) {
                dp[i] = dp[i - 2] + nums[i];
            } else {
                dp[i] = dp[i - 1];
            }

        }
        return dp[dp.length - 1];
    }
}
