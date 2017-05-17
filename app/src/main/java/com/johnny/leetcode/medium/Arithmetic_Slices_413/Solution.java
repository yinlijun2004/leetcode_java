package com.johnny.leetcode.medium.Arithmetic_Slices_413;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */
//https://leetcode.com/problems/arithmetic-slices/#/description

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int[] dp = new int[A.length];
        for(int i = 2; i < A.length; i++) {
            if(A[i] - A[i - 1] == A[i - 1] - A[i - 2])  {
                //存在等差数列，在之前的等差数列+1
                dp[i] = dp[i - 1] + 1;
            }
        }

        int ret = 0;
        for(int i = 0; i < A.length; i++) {
            ret += dp[i];
        }
        return ret;
    }
}
