package com.johnny.leetcode.easy.Max_Consecutive_Ones_485;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/max-consecutive-ones/#/description

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tempMax = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                max = Math.max(tempMax, max);
                tempMax = 0;
                continue;
            }
            tempMax++;
        }
        return Math.max(tempMax, max);
    }
}