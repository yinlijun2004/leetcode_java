package com.johnny.leetcode.easy.Number_Complement_476;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */

//https://leetcode.com/problems/number-complement/#/description

public class Solution {
    public int findComplement(int num) {
        int idx = 0;
        int ret = 0;
        int bitCount = 0;
        for(int i = 31; i >=0; i--) {
            idx = 1 << i;
            if((num & idx) == idx) {
                bitCount = i;
                break;
            }
        }

        for(int i = 0; i < 32 && i < bitCount; i++) {
            idx = 1 << i;
            if((num & idx) == 0) {
                ret += idx;
            }
        }
        return ret;
    }
}
