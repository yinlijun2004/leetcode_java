package com.johnny.leetcode.medium.Predict_the_Winner_586;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */

public class Solution {
    private int maxSelected(int[][] dp, int nums[], int i, int j) {
        if(i > j) {
            return 0;
        }
        if(i == j) {
            return nums[i];
        }
        if(dp[i][j] > 0) {
            return dp[i][j];
        }

        //当前选的最大值，大于下个选手选的最大值
        int sl = nums[i] - maxSelected(dp, nums, i+1, j);
        int sr = nums[j] - maxSelected(dp, nums, i, j - 1);

        dp[i][j] = Math.max(sl, sr);

        return dp[i][j];
    }

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return true;
        }

        int[][] dp = new int[n][n];

        int max = maxSelected(dp, nums, 0, n - 1);

        return max >= 0;
    }
}
