package com.johnny.leetcode.easy.Roman_to_Integer_13;

import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/roman-to-integer/#/description

public class Solution {
    public int romanToInt(String s) {
        String cs = "MDCLXVI";
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put((int)'I', 1);
        map.put((int)'V', 5);
        map.put((int)'X', 10);
        map.put((int)'L', 50);
        map.put((int)'C', 100);
        map.put((int)'D', 500);
        map.put((int)'M', 1000);

        char[] chars = s.toCharArray();
        int ret = 0;
        int lastIndex = cs.length();
        for(int i = chars.length - 1; i >= 0; i--) {
            int value = map.get((int)chars[i]);
            int curIndex = cs.indexOf(chars[i]);
            if(curIndex > lastIndex) {
                ret -= value;
            } else {
                ret += value;
            }
            lastIndex = curIndex;
        }
        return ret;

    }
}
