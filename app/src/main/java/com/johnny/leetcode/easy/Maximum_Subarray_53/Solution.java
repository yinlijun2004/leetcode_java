package com.johnny.leetcode.easy.Maximum_Subarray_53;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int retMax = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            retMax = Math.max(dp[i], retMax);
        }
        return retMax;
    }
}
