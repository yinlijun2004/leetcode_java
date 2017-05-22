package com.johnny.leetcode.medium.Kth_Largest_Element_in_an_Array_215;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/22.
 */
//https://leetcode.com/problems/kth-largest-element-in-an-array/#/description

public class Solution {
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private int helper(int[] nums, int k, boolean asc) {
        for(int i = 0; i < k; i++) {
            for(int j  = i + 1; j < nums.length; j++) {
                if(asc && nums[i] < nums[j]) {
                    swap(nums, i, j);
                } else if(!asc && nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        return nums[k - 1];
    }
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 1) {
            return 0;
        }
        if(k < nums.length / 2) {
            return helper(nums, k, true);
        } else {
            return helper(nums, nums.length - k + 1, false);
        }
    }
}
