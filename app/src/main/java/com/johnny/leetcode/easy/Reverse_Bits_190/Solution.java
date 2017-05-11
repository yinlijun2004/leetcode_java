package com.johnny.leetcode.easy.Reverse_Bits_190;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/reverse-bits/#/description
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        int i = 32;
        while(i-- > 0) {
            ret <<= 1;
            ret |= (n & 1);
            n >>= 1;
        }
        return ret;
    }
}
