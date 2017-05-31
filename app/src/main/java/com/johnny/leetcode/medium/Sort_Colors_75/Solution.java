package com.johnny.leetcode.medium.Sort_Colors_75;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    public void sortColors(int[] nums) {
        int[] k = new int[3];
        for(int i = 0; i < nums.length; i++) {
            k[nums[i]]++;
        }
        int i = 0;
        for(int j = 0; j < 3; j++) {
            for(int n = 0; n < k[j]; n++) {
                nums[i++] = j;
            }
        }
    }
}
