package com.johnny.leetcode.easy.Sqrt_x_69;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/sqrtx/#/description

public class Solution {
    /**
     * 简单的二分查找
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if(x < 2) {
            return x;
        }
        long n = x;
        long max = n / 2;
        long min = 0;
        long mid = 0;
        while(min < max) {

            mid = (min + max) / 2;
            long result = mid * mid;
            if(result == n) {
                return (int)mid;
            } else if(result > n) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        if(min * min > n){
            return (int)min - 1;
        }
        return (int)min;
    }
}
