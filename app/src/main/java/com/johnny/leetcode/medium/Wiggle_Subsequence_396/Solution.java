package com.johnny.leetcode.medium.Wiggle_Subsequence_396;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/6.
 */

public class Solution {
    private int helper(int[] nums, boolean bigger) {
        int count = 1;
        int cur = 0;
        for(int i = 1; i < nums.length; ) {
            boolean found = false;
            if(bigger) {
                while( i < nums.length && nums[i] <= nums[cur]) {
                    i++;
                }
                if(i < nums.length) {
                    found = true;
                }
                while(i < nums.length && nums[i] >= nums[cur]) {
                    cur = i;
                    i++;
                }
            } else {
                while(i < nums.length && nums[i] >= nums[cur]) {
                    i++;
                }
                if(i < nums.length) {
                    found = true;
                }
                while(i < nums.length && nums[i] <= nums[cur]) {
                    cur = i;
                    i++;
                }

            }
            if(!found) {
                break;
            }
            ++count;
            bigger = !bigger;
        }
        return count;
    }
    public int wiggleMaxLength(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        return Math.max(helper(nums, true), helper(nums,  false));
    }
}
