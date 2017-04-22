package com.johnny.leetcode.easy.Factorial_Trailing_Zeroes_172;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/17.
 */
//https://leetcode.com/problems/factorial-trailing-zeroes/#/description

public class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);

    }
}
