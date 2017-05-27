package com.johnny.leetcode.easy.Climbing_Stairs_70;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/climbing-stairs/#/description

public class Solution {
    public int climbStairs(int n) {
        if(n < 1) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int prv1 = 1;
        int prv2 = 2;
        int sum = 0;
        for(int i = 2; i < n; i ++) {
            sum = prv1 + prv2;
            prv1 = prv2;
            prv2 = sum;
        }
        return sum;
    }
}
