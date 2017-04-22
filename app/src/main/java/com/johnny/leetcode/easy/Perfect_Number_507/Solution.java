package com.johnny.leetcode.easy.Perfect_Number_507;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/perfect-number/#/description

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 0) {
            return false;
        }
        /*
        int half = (int)num / 2;
        int sum = 0;
        for(int i = 1; i <= half; i++) {
            if(num %  i == 0) {
                sum += i;
            }
        }
        return sum == num;
        */
        int sqrt = (int)(Math.sqrt(num));
        int sum = 1;
        for(int i = 2; i <= sqrt; i++) {
            if(num % i == 0) {
                sum = sum + i + (num / i);
            }
        }
        if(sqrt * sqrt == num) {
            sum -= sqrt;
        }

        return sum == num;
    }
}