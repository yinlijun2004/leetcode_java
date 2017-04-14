package com.johnny.leetcode.easy.Remove_Element_27;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/remove-element/#/description

public class Solution {
    public int removeElement(int[] nums, int val) {
        int firstVal = -1;
        for(int i = 0; i < nums.length; i++) {
            if(firstVal < 0 && nums[i] == val) {
                firstVal = i;
                continue;
            }
            if(firstVal >= 0 && nums[i] != val) {
                int n = nums[i];
                nums[firstVal] = nums[i];
                nums[i] = val;
                firstVal++;
            }
        }
        if(firstVal < 0) {
            return nums.length;
        } else {
            return firstVal;
        }
    }
}