package com.johnny.leetcode.easy.Convert_a_Number_to_Hexadecimal_405;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/convert-a-number-to-hexadecimal/#/description

public class Solution {
    public String toHex(int num) {
        boolean negative = num < 0;
        char[] CHARS = "0123456789abcdef".toCharArray();
        int n = 8;
        String ret = "";
        while(n-- > 0) {
            char c = CHARS[num & 0xf];
            ret = c + ret;
            num = (num >> 4);
            if(!negative && num == 0) {
                break;
            }
        }
        return ret;
    }
}