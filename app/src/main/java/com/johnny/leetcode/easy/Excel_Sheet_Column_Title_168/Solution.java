package com.johnny.leetcode.easy.Excel_Sheet_Column_Title_168;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */

//https://leetcode.com/problems/excel-sheet-column-title/#/description
public class Solution {
    private final static String ALPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String convertToTitle(int n) {

        String ret = "";
        while(n >= 1) {
            int o = (n - 1) % 26;
            ret = ALPS.charAt(o) + ret;
            n = (n - 1) / 26;
        }

        return ret;
    }
}