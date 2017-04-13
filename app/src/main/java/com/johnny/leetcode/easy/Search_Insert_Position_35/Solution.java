package com.johnny.leetcode.easy.Search_Insert_Position_35;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        //time: O(lg(n))
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int middle = (left + right) / 2;
            int n = nums[middle];

            if(n == target) {
                return middle;
            } else if(n < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        System.out.println("left:" + left + " right:" + right);

        return target > nums[left] ? left + 1 : left;


        //time: O(n)
        /*
        int ret = -1;
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(n >= target) {
                return i;
            }
        }
        if(ret == -1) {
            return nums.length;
        }
        return ret;
        */
    }
}