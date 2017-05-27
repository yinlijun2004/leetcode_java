package com.johnny.leetcode.medium.Target_Sum_494;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */
//https://leetcode.com/problems/target-sum/#/description

public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int[] source = new int[(int)Math.pow(2, nums.length)];
        int[] dest = new int[source.length];
        source[0] = nums[0];
        source[1] = -nums[0];
        int len = 2;
        for(int i = 1; i < nums.length; i++) {
            //System.out.println("i:" + i);
            for(int j = 0; j < len; j++) {
                dest[2*j] = source[j] + nums[i];
                dest[2*j + 1] = source[j] - nums[i];
            }
            len <<= 1;

            int[] tmp = source;
            source = dest;
            dest = tmp;
        }
        int ret = 0;
        for(int i = 0; i < source.length; i++) {
            if(source[i] == S) {
                ++ret;
            }
        }
        return ret;
    }

}
