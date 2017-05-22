package com.johnny.leetcode.medium.Bulb_Switcher_319;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/19.
 */
//https://leetcode.com/problems/bulb-switcher/#/description

public class Solution {
    /**
     * 一个灯是灭还是亮，取决于它的约数个数是奇数还是偶数，如果是奇数亮，偶数就灭。
     * 如果是一个数刚好是另一个数的平方。
     * 所以本题只要返回刚好是平方数的个数就好了。
     * 比如
     * 6：1,2,3,6
     * 9: 1,3,9
     * 12:1,2,3,4,6,12
     * 16:1,2,4,8,16
     */
    public int bulbSwitch(int n) {
        int ret = 0;
        for(int i = 1; i * i <= n; ++i) {
            ++ret;
        }

        return ret;
    }
}