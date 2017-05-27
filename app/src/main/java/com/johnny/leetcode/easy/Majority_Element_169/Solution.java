package com.johnny.leetcode.easy.Majority_Element_169;

import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/majority-element/#/description

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            int times = 1;
            if(map.containsKey(nums[i])) {
                times = map.get(nums[i]) + 1;
                map.put(nums[i], times);
            } else {
                map.put(nums[i], times);
            }
            if(times > len / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}