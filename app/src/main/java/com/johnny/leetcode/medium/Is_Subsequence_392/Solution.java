package com.johnny.leetcode.medium.Is_Subsequence_392;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */
//https://leetcode.com/problems/is-subsequence/#/description
public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int i = 0, j = 0;
        for(i = ss.length - 1, j = ts.length - 1; j >= 0 && i >= 0;) {
            if(ss[i] == ts[j]) {
                i--;
                j--;
            } else {
                j--;
            }
        }
        return i == -1;
    }
}