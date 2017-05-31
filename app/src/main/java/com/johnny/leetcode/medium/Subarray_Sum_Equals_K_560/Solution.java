package com.johnny.leetcode.medium.Subarray_Sum_Equals_K_560;

import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    /**
     * HashMap解法
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0, ret = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum - k)) {
                ret += map.get(sum - k);
            }
            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ret;
    }
    /**
     * 暴力解法
     * @param nums
     * @param k
     * @return
     */
    /*
    public int subarraySum(int[] nums, int k) {
        int ret = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) {
                    ++ret;
                }
            }
        }
        return ret;
    }
    */
}
