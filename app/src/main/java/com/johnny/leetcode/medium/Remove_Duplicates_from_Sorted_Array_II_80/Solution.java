package com.johnny.leetcode.medium.Remove_Duplicates_from_Sorted_Array_II_80;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) {
            return 0;
        }
        if(nums.length < 3) {
            return nums.length;
        }

        int dc = 0;
        int ret = 1;
        int c = 1;
        int n = nums[0];
        for(int i = 1; i < nums.length - dc; i++) {
            if(nums[i] != n) {
                n = nums[i];
                c = 1;
                ++ret;
            } else if(c < 2){
                ++c;
                ++ret;
            } else {
                int cc = 0;
                int j = i;
                while(j < nums.length -dc && nums[j] == n) {
                    cc++;
                    j++;
                }
                for(;j < nums.length - dc; j++) {
                    nums[j - cc] = nums[j];
                }
                dc += cc;
                i--;
            }
        }
        return nums.length - dc;
    }
}
