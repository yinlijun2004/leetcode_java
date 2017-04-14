package com.johnny.leetcode.easy.Plus_One_66;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/plus-one/#/description

public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            int n = digits[i] + carry;
            carry = n / 10;
            digits[i] = n % 10;
        }
        if(carry > 0) {
            int[] ret = new int[digits.length + 1];
            ret[0] = carry;
            System.arraycopy(digits, 0, ret, 1, digits.length);
            return ret;
        } else {
            int[] ret = new int[digits.length];
            System.arraycopy(digits, 0, ret, 0, digits.length);
            return ret;
        }

    }
}