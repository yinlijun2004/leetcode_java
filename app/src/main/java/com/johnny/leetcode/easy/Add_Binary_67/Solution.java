package com.johnny.leetcode.easy;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/add-binary/#/description

public class Solution {
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] ba = b.toCharArray();
        int carry = 0;
        String ret = "";
        int len = Math.min(aa.length, ba.length);
        int i = 0;
        while(i < len) {
            int byteA = aa[aa.length - i - 1] - '0';
            int byteB = ba[ba.length - i - 1] - '0';
            int sum = byteA + byteB + carry;
            carry = sum / 2;
            sum = sum % 2;
            ret = String.valueOf(sum) + ret;
            ++i;
        }
        len = Math.min(aa.length, ba.length);
        System.out.println("ret:" + ret);
        if(aa.length > len) {
            len = aa.length - len;
            while(len > 0) {
                int byteA = aa[len - 1] - '0';
                int sum = byteA + carry;
                carry = sum / 2;
                sum = sum % 2;
                ret = String.valueOf(sum) + ret;
                --len;
            }
        } else if (ba.length > len) {
            len = ba.length - len;
            while(len > 0) {
                int byteB = ba[len - 1] - '0';
                int sum = byteB + carry;
                carry = sum / 2;
                sum = sum % 2;
                ret = String.valueOf(sum) + ret;
                --len;
            }
        }
        System.out.println("ret:" + ret);

        if(carry > 0) {
            ret = String.valueOf(1) + ret;
        }
        return ret;
    }
}