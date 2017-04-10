package com.johnny.leetcode.easy.Minimum_Moves_to_Equal_Array_Elements_453;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description

public class Solution {
    public int minMoves(int[] nums) {
        int sum = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return sum - nums.length * min;
    }
}