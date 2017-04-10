package com.johnny.leetcode.easy.Valid_Anagram_242;

import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/valid-anagram/#/description

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null && t != null) return false;
        if(s != null && t == null) return false;
        if(s.length() != t.length()) return false;

        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        for(int i = 0; i <  cs.length; i++) {
            if(cs[i] != ts[i]) {
                return false;
            }
        }
        return true;
    }
}
