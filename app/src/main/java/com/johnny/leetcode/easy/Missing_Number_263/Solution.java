package com.johnny.leetcode.easy.Missing_Number_263;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/missing-number/#/description

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
            if(i < n - 1) {
                sum -= nums[i];
            }
        }
        return sum;
    }
}
