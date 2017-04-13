package com.johnny.leetcode.easy.Ugly_Number_263;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */
//https://leetcode.com/problems/ugly-number/#/description

public class Solution {
    public boolean isUgly(int num) {
        if(num == 1) {
            return true;
        }

        int[] nums = new int[]{2, 3, 5};
        for(int i = 0; i < nums.length; i++) {
            while(num > 0) {
                int c = nums[i];
                if(num % c != 0) {
                    break;
                }
                num /= c;
                if(num == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
