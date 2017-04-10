package com.johnny.leetcode.easy.Relative_Ranks_506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/relative-ranks/#/description

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        String[] ret = new String[nums.length];
        int[] newNums = nums.clone();
        Arrays.sort(newNums);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < newNums.length - 3; i++) {
            map.put(newNums[i], String.valueOf(newNums.length - i));
        }
        if (newNums.length > 0) {
            map.put(newNums[newNums.length - 1], "Gold Medal");
        }
        if (newNums.length > 1) {
            map.put(newNums[newNums.length - 2], "Silver Medal");
        }
        if (newNums.length > 2) {
            map.put(newNums[newNums.length - 3], "Bronze Medal");
        }
        for (int i = 0; i < newNums.length; i++) {
            ret[i] = map.get(nums[i]);
        }

        return ret;
    }
}
