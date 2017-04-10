package com.johnny.leetcode.easy.Hamming_Distance_461;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */

//https://leetcode.com/problems/hamming-distance/#/description

public class Solution {
    public int hammingDistance(int x, int y) {
        int idx = 0;
        int xor = x^y;
        int ret = 0;
        for(int i = 0; i < 32; i++) {
            idx = 1 << i;
            if((xor & idx) == idx) {
                ++ret;
            }
        }
        return ret;
    }
}
