package com.johnny.leetcode.easy.First_Unique_Character_in_a_String_387;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/first-unique-character-in-a-string/#/description

public class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) {
            return -1;
        }
        char[] newChars = s.toCharArray();
        char[] chars = s.toCharArray();
        Set set = new HashSet();
        Arrays.sort(chars);
        boolean uc = true;
        char u = chars[0];
        String us = "";
        for(int i = 1; i < chars.length; i++) {
            if(u == chars[i]) {
                uc = false;
            } else {
                if(uc) {
                    us = us + u;
                } else {
                    uc = true;
                }
            }
            u = chars[i];
        }
        if(uc) {
            us = us + u;
        }
        for(int i = 0; i < chars.length; i++) {
            if(us.indexOf(newChars[i]) >= 0) {
                return i;
            }
        }
        return -1;
    }
}