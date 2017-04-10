package com.johnny.leetcode.easy.Sum_of_Two_Integers_371;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/sum-of-two-integers/#/description

public class Solution {
    public int getSum(int a, int b) {
        if(b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}