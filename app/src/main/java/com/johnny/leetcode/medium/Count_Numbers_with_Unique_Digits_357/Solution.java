package com.johnny.leetcode.medium.Count_Numbers_with_Unique_Digits_357;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/17.
 */

//https://leetcode.com/problems/count-numbers-with-unique-digits/#/description
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) {
            return 1;
        }

        int[] nums = new int[10];
        for(int i = 0; i < 10; i++) {
            if(i == 0) {
                nums[i] = 9;
                continue;
            }
            nums[i] = nums[i - 1] * (10 - i);
        }
        int ret = 1;
        for(int i = 0; i < n && i < 10; i++) {
            ret += nums[i];
        }
        return ret;
    }
}
