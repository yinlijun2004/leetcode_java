package com.johnny.leetcode.easy.Valid_Perfect_Square_367;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/valid-perfect-square/#/description

public class Solution {
    public boolean isPerfectSquare(int num) {
        int n = (int)Math.sqrt(num);
        return n * n == num;
    }
}