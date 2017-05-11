package com.johnny.leetcode.easy.Nth_Digit_400;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/9.
 */
//https://leetcode.com/problems/nth-digit/#/solutions

public class Solution {
    public int findNthDigit(int n) {
        //整形会溢出
        long base = 9;
        int digits = 1;
        long num_base = 1;
        //1. 计算位数
        while(n - base * digits > 0) {
            n -= base * digits;
            num_base *= 10;
            base *= 10;
            digits++;
        }

        n--;
        //2.当前位数中第几个数字
        int idx_num = n / digits;
        base = num_base;
        long num = base + idx_num;
        //3.当前数字中第几位
        int idx_digit = n % digits;
        //4.求得该位
        idx_digit = digits - idx_digit - 1;
        while(idx_digit > 0) {
            System.out.println("num:" + num);
            num = num / 10;
            idx_digit--;
        }

        return (int)num % 10;
    }
}