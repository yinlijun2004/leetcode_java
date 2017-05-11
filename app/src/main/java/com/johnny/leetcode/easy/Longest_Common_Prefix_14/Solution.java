package com.johnny.leetcode.easy.Longest_Common_Prefix_14;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/longest-common-prefix/#/description

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        String minStr = "";
        for(int i = 0; i < strs.length; i++) {
            String curStr = strs[i];
            if(curStr.length() < minLen) {
                minLen = curStr.length();
                minStr = curStr;
            }
        }
        for(int i = 0; i < strs.length; i++) {
            String curStr = strs[i];
            while(minStr.length() > 0 && curStr.indexOf(minStr) != 0) {
                minStr = minStr.substring(0, minStr.length() - 1);
            }
        }
        return minStr;
    }
}