package com.johnny.leetcode.easy.Detect_Capital_520;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/detect-capital/#/description

public class Solution {
    public boolean detectCapitalUse(String word) {
        String allUp = word.toUpperCase();
        if(allUp.equals(word)) {
            return true;
        }
        String allLow = word.toLowerCase();
        if(allLow.substring(1, allLow.length()).equals(word.substring(1, word.length()))) {
            return true;
        }
        return false;
    }
}
