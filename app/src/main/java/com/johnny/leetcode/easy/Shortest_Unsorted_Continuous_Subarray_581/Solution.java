package com.johnny.leetcode.easy.Shortest_Unsorted_Continuous_Subarray_581;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/27.
 */
//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#/description

public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[nums.length - 1];
        int beg = -1;
        int end = -2;
        for(int i = 1; i < n; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[n - i - 1], min);
            if(nums[i] < max) {
                end = i;
            }
            if(nums[n - 1 - i] > min) {
                beg = n - 1 -i;
            }
        }
        return end - beg + 1;
    }
}