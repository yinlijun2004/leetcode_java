package com.johnny.leetcode.medium.Search_in_Rotated_Sorted_Array_II_81;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    /**
     * 线性查找，O(N)时间复杂度。
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}