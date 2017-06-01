package com.johnny.leetcode.medium.Jump_Game_55;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */
//https://leetcode.com/problems/jump-game/#/description

public class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        int i = 0;
        int sum = 0;
        for(; i < nums.length && i <= sum; ++i) {
            sum = Math.max(i + nums[i], sum);
        }
        return i == nums.length;
    }
}