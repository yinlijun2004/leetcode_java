package com.johnny.leetcode.easy.Number_of_1_Bits_191;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */
//https://leetcode.com/problems/number-of-1-bits/#/description

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        int i = 32;
        while(i-- > 0) {
            ret += (n & 0x1);
            n >>= 1;
        }
        return ret;
    }
}