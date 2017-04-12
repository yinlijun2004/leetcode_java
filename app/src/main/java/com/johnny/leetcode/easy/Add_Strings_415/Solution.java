package com.johnny.leetcode.easy.Add_Strings_415;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/add-strings/#/description

public class Solution {
    public String addStrings(String num1, String num2) {
        char[] nb1 = num1.toCharArray();
        char[] nb2 = num2.toCharArray();
        char[] CHARS = "0123456789".toCharArray();
        int l1 = nb1.length;
        int l2 = nb2.length;
        int mb = Math.max(l1, l2);
        int carry = 0;
        String ret = "";
        int base = 1;
        for(int i = 0; i < mb; i++) {
            int ln = 0;
            if(i < l1) {
                ln = nb1[l1 - i - 1] - '0';
            }
            int rn = 0;
            if(i < l2) {
                rn = nb2[l2 - i - 1] - '0';
            }
            char c = CHARS[(ln + rn + carry) % 10];
            carry = (ln + rn + carry) / 10;
            base *= 10;
            ret = c + ret;
        }
        if(carry > 0) {
            ret = CHARS[carry] + ret;
        }
        return ret;
    }
}
