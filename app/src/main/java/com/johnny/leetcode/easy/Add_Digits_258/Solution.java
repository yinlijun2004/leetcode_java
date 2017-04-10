package com.johnny.leetcode.easy.Add_Digits_258;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/add-digits/#/description

public class Solution {
    public int addDigits(int num) {
        if(num == 0) {
            return num;
        }
        num = num % 9;
        return num > 0 ? num : 9;
    }
}
