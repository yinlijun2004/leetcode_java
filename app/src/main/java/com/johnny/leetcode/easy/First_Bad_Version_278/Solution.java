package com.johnny.leetcode.easy.First_Bad_Version_278;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/first-bad-version/#/description

public class Solution {

    private boolean isBadVersion(int n) {
        return false;
    }

    public int firstBadVersion(int n) {
        long left = 1;
        long last = n;
        long mid = 0;
        while(left < last) {
            mid = (left + last) / 2;
            if(isBadVersion((int)mid)) {
                last = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return isBadVersion((int)left) ? (int)left : (int)(left + 1);
    }

}