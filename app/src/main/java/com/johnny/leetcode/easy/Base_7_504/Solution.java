package com.johnny.leetcode.easy.Base_7_504;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/base-7/#/description

public class Solution {
    public String convertToBase7(int num) {
        String ret = "";
        int newNum = Math.abs(num);
        while(newNum > 0) {
            int a = newNum % 7;
            ret = a+ret;
            newNum /= 7;
        }
        if(num == 0) {
            ret = "0";
        }
        if(num < 0) {
            ret = "-" + ret;
        }
        return ret;
    }
}
