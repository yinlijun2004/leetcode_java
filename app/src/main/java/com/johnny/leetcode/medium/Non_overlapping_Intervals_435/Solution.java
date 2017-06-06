package com.johnny.leetcode.medium.Non_overlapping_Intervals_435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/6.
 */

public class Solution {
    private class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.end - b.end;
            }
        });
        int count = 1;
        int end = intervals[0].end;
        for(int i = 1; i < intervals.length;i++) {
            if(intervals[i].start >= end) {
                count++;
                end = intervals[i].end;
            }
        }
        return intervals.length - count;
    }
}
