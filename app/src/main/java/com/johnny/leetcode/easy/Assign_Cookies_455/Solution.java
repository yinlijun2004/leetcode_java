package com.johnny.leetcode.easy.Assign_Cookies_455;

import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/assign-cookies/#/description

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int i = 0;
        for(i = 0, j = 0; i < g.length && j < s.length; j++) {
            if(g[i] <= s[j]) ++i;
        }
        return i;
    }
}
