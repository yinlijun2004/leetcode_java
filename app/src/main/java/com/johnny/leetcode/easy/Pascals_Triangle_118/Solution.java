package com.johnny.leetcode.easy.Pascals_Triangle_118;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/pascals-triangle/#/description

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        if(numRows > 0) {
            List<Integer> first = new ArrayList<Integer>();
            first.add(1);
            retList.add(first);
        }
        for(int i = 1; i < numRows; i++) {
            List<Integer> last = retList.get(i - 1);
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0; j <= last.size(); j++) {
                if(j == 0) {
                    list.add(last.get(j));
                } else if(j == last.size()) {
                    list.add(last.get(j - 1));
                } else {
                    list.add(last.get(j - 1) + last.get(j));
                }
            }
            retList.add(list);
        }
        return retList;
    }
}
