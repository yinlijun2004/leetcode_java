package com.johnny.leetcode.easy.Construct_the_Rectangle_492;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/construct-the-rectangle/#/description

public class Solution {
    public int[] constructRectangle(int area) {
        int num = (int)Math.sqrt(area);

        for(int i = num; i >= 2; i--) {
            if(area % i == 0) {
                return new int[] {area / i, i};
            }
        }
        return new int[]{area, 1};
    }
}