package com.johnny.leetcode.easy.Remove_Duplicates_from_Sorted_Array_26;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
    
public class Solution {
    public int removeDuplicates(int[] nums) {
        int dup = 0;
        int len = nums.length;
        int tmpDup = 0;
        for(int i = 1; i < len - dup;) {
            if(nums[i] == nums[i - 1]) {
                int j = i + 1;
                for(; j < len - dup; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[len - dup - 1] = nums[i - 1];
                dup++;
            } else {
                i++;
            }
        }
        return len - dup;
    }
}