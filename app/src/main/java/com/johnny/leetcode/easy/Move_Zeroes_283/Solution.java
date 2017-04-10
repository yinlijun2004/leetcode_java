package com.johnny.leetcode.easy.Move_Zeroes_283;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/move-zeroes/#/description

public class Solution {
    public void moveZeroes(int[] nums) {
        int zi = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && zi >= 0) {
                nums[zi] = nums[i];
                nums[i] = 0;
                zi++;
            } else if(nums[i] == 0 && zi < 0){
                zi = i;
            }
        }
    }
}
