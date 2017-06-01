package com.johnny.leetcode.easy.Array_Partition_I_561;

import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length % 2 == 1) {
            return 0;
        }
        Arrays.sort(nums);
        int ret = 0;
        for(int i  = 0; i < nums.length; i += 2) {
            ret += nums[i];
        }
        return ret;
    }
}