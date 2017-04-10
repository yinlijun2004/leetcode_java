package com.johnny.leetcode.easy.Single_Number_136;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/single-number/#/description

public class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        int i = 0;
        int len = nums.length;
        for(; i < len; i++) {
            ret = ret ^ nums[i];
        }
        return ret;
    }
}