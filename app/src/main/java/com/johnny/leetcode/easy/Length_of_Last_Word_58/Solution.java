package com.johnny.leetcode.easy.Length_of_Last_Word_58;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/length-of-last-word/#/description

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int last = s.length() - 1;
        while(last >= 0 && Character.isWhitespace(s.charAt(last))) {
            --last;
        }
        if(last < 0) {
            return 0;
        }

        for(int i = last; i >= 0; i--) {
            if(Character.isWhitespace(s.charAt(i))) {
                return last - i;
            }
        }
        return last + 1;
    }
}