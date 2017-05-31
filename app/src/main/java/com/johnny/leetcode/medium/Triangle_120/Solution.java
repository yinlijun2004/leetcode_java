package com.johnny.leetcode.medium.Triangle_120;

import java.util.ArrayList;
import java.util.List;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    /**
     * 用两个list中间量，保存每一行的累加的结果，最后找出最小值。
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) {
            return 0;
        }

        List<Integer> array = new ArrayList<Integer>();
        List<Integer> tmp = new ArrayList<Integer>();
        array.add(0, triangle.get(0).get(0));
        for(int i = 1; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            for(int j = 0; j < list.size(); j++) {
                if(j == 0) {
                    tmp.add(0, array.get(0) + list.get(j));
                } else if(j == list.size() - 1) {
                    tmp.add(j, array.get(j - 1) + list.get(j));
                } else {
                    tmp.add(j, Math.min(array.get(j - 1), array.get(j)) + list.get(j));
                }
            }
            array.clear();
            array.addAll(tmp);
            tmp.clear();
        }
        int min = array.get(0);
        for(int i = 1; i < array.size(); i++) {
            if(array.get(i) < min) {
                min = array.get(i);
            }
        }
        return min;
    }
}
