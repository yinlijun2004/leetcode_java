package com.johnny.leetcode.medium.Longest_Palindromic_Subsequence_516;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */
//https://leetcode.com/problems/longest-palindromic-subsequence/#/description

public class Solution {
    private int helper(char[] cs, int[][] dp, int s, int e) {
        if(s > e) {
            return 0;
        }
        if(s == e) {
            return 1;
        }
        if(dp[s][e] > 0) {
            return dp[s][e];
        }

        if(cs[s] == cs[e]) {
            dp[s][e] =  2 + helper(cs, dp, s + 1, e - 1);
        } else {
            dp[s][e] = Math.max(helper(cs, dp, s + 1, e), helper(cs, dp, s, e - 1));
        }
        return dp[s][e];
    }
    public int longestPalindromeSubseq(String s) {
        char[] cs = s.toCharArray();
        int[][] dp = new int[cs.length][cs.length];
        return helper(cs, dp, 0, cs.length - 1);
    }
}
