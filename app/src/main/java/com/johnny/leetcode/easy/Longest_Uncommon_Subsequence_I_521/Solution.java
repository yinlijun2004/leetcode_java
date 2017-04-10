package com.johnny.leetcode.easy.Longest_Uncommon_Subsequence_I_521;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/longest-uncommon-subsequence-i/#/description

public class Solution {
    public int findLUSlength(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA != lenB)
            return Math.max(lenA, lenB);
        else if (!a.equals(b))
            return lenA;
        else
            return -1;
    }
}