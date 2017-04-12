package com.johnny.leetcode.easy.Reverse_String_II_541;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/reverse-string-ii/#/description

public class Solution {
    public String reverseStr(String s, int k) {
        if(k < 0) {
            return s;
        }
        k = Math.min(k, s.length());
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i += 2*k) {
            int len = Math.min(k, chars.length - i);
            for(int j = i, m = 0; j < (i + len / 2) && j < chars.length; j++, m++) {
                char c = chars[j];
                chars[j] = chars[i + len - m - 1];
                chars[i + len - m - 1] = c;
            }
        }
        return new String(chars);
    }
}