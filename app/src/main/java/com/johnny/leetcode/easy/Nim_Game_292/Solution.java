package com.johnny.leetcode.easy.Nim_Game_292;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/nim-game/#/description

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}