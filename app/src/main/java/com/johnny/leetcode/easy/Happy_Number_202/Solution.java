package com.johnny.leetcode.easy.Happy_Number_202;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/happy-number/#/description

public class Solution {
    public boolean isHappy(int n) {
        while(n > 4) {
            int num = 0;
            int tn = n;
            while(tn > 0) {
                int i = tn % 10;
                num += i * i;
                tn /= 10;
            }
            n = num;
        }
        return n == 1;
    }
}