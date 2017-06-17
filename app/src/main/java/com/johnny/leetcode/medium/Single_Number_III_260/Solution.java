package com.johnny.leetcode.medium.Single_Number_III_260;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/12.
 */

public class Solution {
    public int[] singleNumber(int[] nums) {
        int sum = 0;
        for(int n : nums) {
            sum ^= n;
        }
        //sum &= -sum;
        sum = (sum & ~(sum - 1));
        int a = 0, b = 0;
        for(int n : nums) {
            if((n & sum) > 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[] {a, b};
    }
}