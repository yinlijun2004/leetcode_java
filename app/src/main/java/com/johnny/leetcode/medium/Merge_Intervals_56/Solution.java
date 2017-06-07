package com.johnny.leetcode.medium.Merge_Intervals_56;

import com.johnny.leetcode.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/7.
 */

public class Solution {
    private List<Interval> helper(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size() == 0) {
            return result;
        }
        Interval inter = intervals.get(0);
        result.add(new Interval(inter.start, inter.end));
        boolean found = false;
        for(int i = 1; i < intervals.size(); i++) {
            found = false;
            Interval cur = intervals.get(i);
            for(int j = 0; j < result.size(); j++) {
                Interval it = result.get(j);
                int max = Math.max(it.end, cur.end);
                int min = Math.min(it.start, cur.start);
                int len = max - min;

                if(len <= (it.end - it.start + cur.end - cur.start)) {
                    it.start = Math.min(it.start, cur.start);
                    it.end = Math.max(it.end, cur.end);
                    found = true;
                    break;
                }
            }
            if(!found) {
                result.add(new Interval(cur.start, cur.end));
            }
        }
        return result;
    }
    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = helper(intervals);
        while(result.size() < intervals.size()) {
            intervals = result;
            result = helper(intervals);
        }

        return result;
    }
}