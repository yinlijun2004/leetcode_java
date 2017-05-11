package com.johnny.leetcode.easy.Range_Sum_Query_Immutable_303;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/range-sum-query-immutable/#/description
public class Solution {
    public class NumArray {
        private int[] arrs;
        public NumArray(int[] nums) {
            arrs = new int[nums.length];
            for(int i = 0; i < nums.length; i++) {
                if(i == 0) {
                    arrs[i] = nums[0];
                    continue;
                }
                arrs[i] = arrs[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if(i == 0) {
                return arrs[j];
            }
            return arrs[j] - arrs[i - 1];
        }
    }
}
