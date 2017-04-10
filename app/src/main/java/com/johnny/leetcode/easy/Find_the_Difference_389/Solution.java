package com.johnny.leetcode.easy.Find_the_Difference_389;

import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/find-the-difference/#/description

public class Solution {
    public char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        int i = 0;
        for(i = 0; i < cs.length; i++) {
            if(cs[i] != ts[i]) {
                return ts[i];
            }
        }
        return ts[i];
    }
}
