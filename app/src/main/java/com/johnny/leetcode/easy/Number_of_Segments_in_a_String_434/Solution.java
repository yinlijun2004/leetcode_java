package com.johnny.leetcode.easy.Number_of_Segments_in_a_String_434;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/number-of-segments-in-a-string/#/description

public class Solution {
    public int countSegments(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 0) {
            return 0;
        }
        boolean spaceState = true;
        int retNum = 0;
        for(int i = 0; i < chars.length; i++) {
            boolean ischar = !Character.isSpaceChar(chars[i]);
            if(ischar && spaceState) {
                spaceState = false;
                ++retNum;
            } else if(!ischar) {
                spaceState = true;
            }
        }
        return retNum;
    }
}