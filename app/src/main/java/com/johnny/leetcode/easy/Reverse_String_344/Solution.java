package com.johnny.leetcode.easy.Reverse_String_344;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/reverse-string/#/description

public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        for(int i = 0; i < len / 2; i++) {
            char l = chars[i];
            char r = chars[len - i - 1];
            chars[i] = r;
            chars[len - i - 1] = l;
        }
        return new String(chars);
    }
}