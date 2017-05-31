package com.johnny.leetcode.medium.Array_Nesting_565;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    public int arrayNesting(int[] nums) {
        boolean visited[] = new boolean[nums.length];
        int ret = 0;
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                continue;
            }
            int j = i;
            int count = 0;
            while(count == 0 || i != j) {
                visited[j] = true;
                j = nums[j];
                count++;
            }
            if(ret < count) {
                ret = count;
            }
        }

        return ret;
    }
}
