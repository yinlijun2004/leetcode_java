package com.johnny.leetcode.easy.Power_of_Three_326;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/power-of-three/#/description

public class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && (1162261467 % n == 0);
    }
}
