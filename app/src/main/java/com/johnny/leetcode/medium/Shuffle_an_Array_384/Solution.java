package com.johnny.leetcode.medium.Shuffle_an_Array_384;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/12.
 */

public class Solution {
    private int nums[];

    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] order = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int idx = (int)(Math.random() * (i + 1));
            order[i] = order[idx];
            order[idx] = nums[i];
        }

        return order;
    }
}