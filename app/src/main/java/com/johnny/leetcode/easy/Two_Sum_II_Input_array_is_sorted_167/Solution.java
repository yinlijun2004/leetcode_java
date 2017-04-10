package com.johnny.leetcode.easy.Two_Sum_II_Input_array_is_sorted_167;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right] - target;
            if(sum == 0) {
                return new int[] {left + 1, right + 1};
            } else if(sum > 0) {
                --right;
            } else {
                ++left;
            }
        }
        return null;
    }
}
