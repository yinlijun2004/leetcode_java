package com.johnny.leetcode.easy.Reverse_Words_in_a_String_III_557;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/6.
 */
//https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description

public class Solution {
    private String reverseString(String s) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = cs.length - 1; i >= 0; i--) {
            sb.append(cs[i]);
        }
        return sb.toString();
    }
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ss.length; i++) {
            sb.append(reverseString(ss[i]));
            if(i != ss.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}