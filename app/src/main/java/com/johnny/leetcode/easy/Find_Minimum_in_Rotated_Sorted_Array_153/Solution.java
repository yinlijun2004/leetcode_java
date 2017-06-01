package com.johnny.leetcode.easy.Find_Minimum_in_Rotated_Sorted_Array_153;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    /**
     *  二分搜索解法，时间复杂度O(lgN)
     */
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int s = 0, e = nums.length - 1;
        while(s < e - 1) {
            int m = (s + e) / 2;
            if(nums[m] > nums[e]) {
                s = m;
            } else {
                e = m;
            }
        }
        return Math.min(nums[s], nums[s + 1]);
    }

    /**
     * 暴力解法，时间复杂度O(n)，报TLE，时间超时。
     */
    /*
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int ret = 0;
        int min = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
                ret = i;
            }
        }
        return min;
    }
    */
}
