package com.johnny.leetcode.easy.Excel_Sheet_Column_Number_171;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/excel-sheet-column-number/#/description

public class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        int base = 0;
        for(int i = chars.length - 1; i >= 0; i--) {
            base = (int)Math.pow(26,(chars.length - i - 1));
            ret += (chars[i] - 'A' + 1) * base ;
        }
        return ret;
    }
}