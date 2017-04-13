package com.johnny.leetcode.easy.Repeated_Substring_Pattern_459;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int slen = s.length();
        int len = slen / 2;
        for(; len > 0; len--) {
            if(slen % len != 0) {
                continue;
            }
            int i = 0;
            String ss = s.substring(i, i + len);
            boolean allequal = true;;
            for(i = len; i < slen; i += len) {
                if(!ss.equals(s.substring(i, i + len))) {
                    allequal = false;
                    break;
                }
            }
            if(allequal) {
                return true;
            }
        }
        return false;
    }
}