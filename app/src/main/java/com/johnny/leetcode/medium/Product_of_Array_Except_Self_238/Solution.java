package com.johnny.leetcode.medium.Product_of_Array_Except_Self_238;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */
//https://leetcode.com/problems/product-of-array-except-self/#/description

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int zc = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zc++;
            } else {
                pro *= nums[i];
            }
        }

        int[] ret = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(zc > 1) {
                ret[i] = 0;
            } else if(zc == 1) {
                ret[i] = nums[i] == 0 ? pro : 0;
            } else {
                ret[i] = pro / nums[i];
            }
        }
        return ret;
    }
}