package com.johnny.leetcode.easy.Contains_Duplicate_217;

import java.util.HashSet;
import java.util.Set;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/contains-duplicate/#/description

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}