package com.johnny.leetcode.easy.Pascals_Triangle_II_119;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/pascals-triangle-ii/#/description

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int len = rowIndex + 1;
        List<Integer> ret = new ArrayList<Integer>();

        if(rowIndex == 0) {
            ret.add(1);
            return ret;
        }
        if(rowIndex == 1) {
            ret.add(1);
            ret.add(1);
            return ret;
        }
        ret.add(1);
        int i = 0;
        for(i = 1; i < len / 2; i++) {
            long data = (long)ret.get(i - 1)*(rowIndex - i + 1) / i;
            ret.add((int)data);
        }
        if(rowIndex % 2 == 0) {
            long data = (long)ret.get(i - 1)*(rowIndex - i + 1) / i;
            ret.add((int)data);
        }
        --i;
        for(; i >= 0; i--) {
            ret.add(ret.get(i));
        }
        return ret;
    }
}
