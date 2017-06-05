package com.johnny.leetcode.easy.Minimum_Index_Sum_of_Two_Lists_599;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/5.
 */

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1= new HashMap<String, Integer>();
        HashMap<String, Integer> map2= new HashMap<String, Integer>();
        for(int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        int min = Integer.MAX_VALUE;
        ArrayList<String> list = new ArrayList<String>();
        for(String s : map1.keySet()) {
            if(map2.containsKey(s)) {
                int cur = map1.get(s) + map2.get(s);
                if(min > cur) {
                    list.clear();
                    list.add(s);
                    min = cur;
                } else if(min == cur) {
                    list.add(s);
                }
            }
        }
        String[] result = new String[list.size()];
        int i = 0;
        for(String s : list) {
            result[i++] = s;
        }
        return result;
    }
}