package com.johnny.leetcode.medium.Complex_Number_Multiplication_535;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/complex-number-multiplication/#/description
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        if(a == null || b == null || a.length() == 0 || b.length() == 0) {
            return null;
        }
        String[] as = a.split("\\+");
        if(as.length != 2) {
            return null;
        }
        String [] bs = b.split("\\+");
        if(bs.length != 2) {
            return null;
        }

        int a1 = Integer.valueOf(as[0]);
        int a2 = Integer.valueOf(as[1].substring(0, as[1].length() - 1));
        int b1 = Integer.valueOf(bs[0]);
        int b2 = Integer.valueOf(bs[1].substring(0, bs[1].length() - 1));

        return String.valueOf(a1 * b1 - a2 * b2) + "+" + String.valueOf(a1 * b2 + a2 * b1) + "i";

    }
}