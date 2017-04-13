package com.johnny.leetcode.easy.Power_of_Two_231;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/power-of-two/#/description

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        int oneCount = 0;
        while(n > 0) {
            if((n & 0x1) == 0x1) {
                ++oneCount;
            }
            n >>= 1;
            if(oneCount > 1) {
                return false;
            }
        }
        return true;
    }
}