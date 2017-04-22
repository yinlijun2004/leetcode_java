package com.johnny.leetcode.easy.Contains_Duplicate_II_219;

import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int j = (int)map.get(nums[i]);
                if(i - j <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}