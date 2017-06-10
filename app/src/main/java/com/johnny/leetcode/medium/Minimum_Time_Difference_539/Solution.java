package com.johnny.leetcode.medium.Minimum_Time_Difference_539;

import java.util.Arrays;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/10.
 */
//https://leetcode.com/problems/minimum-time-difference/#/description

public class Solution {
    private static int getDiff(int a, int b) {
        int total = 24 * 60;
        int diff = Math.abs(a - b);
        return Math.min(diff, total - diff);
    }

    private static int getTime(String a) {
        String[] aa = a.split(":");
        int ha = Integer.valueOf(aa[0]);
        int ma = Integer.valueOf(aa[1]);
        return ha * 60 + ma;
    }

    public int findMinDifference(List<String> list) {
        int n = list.size();
        int[] times = new int[n];
        int i = 0;
        for(String t : list) {
            times[i++] =  getTime(t);
        }
        Arrays.sort(times);
        int min = getDiff(times[0], times[n - 1]);
        for(i = 1; i < n; i++) {
            min = Math.min(min, getDiff(times[i], times[i - 1]));
        }

        return min;
    }
}