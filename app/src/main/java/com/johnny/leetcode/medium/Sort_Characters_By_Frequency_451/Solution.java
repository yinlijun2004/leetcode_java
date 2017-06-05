package com.johnny.leetcode.medium.Sort_Characters_By_Frequency_451;

import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/5.
 */

public class Solution {
    public String frequencySort(String s) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        char[] ca = s.toCharArray();
        for(char c : ca) {

            if(map.containsKey((int)c)) {
                map.put((int)c, map.get((int)c) + 1);
            } else {
                map.put((int)c, 1);
            }
        }


        int[] count = new int[map.size()];
        int[] cs = new int[map.size()];
        int i = 0;
        for(Integer k : map.keySet()) {
            cs[i] = k;
            count[i] = map.get(k);
            i++;
        }
        for(i = 0; i < count.length; i++) {
            for(int j = i + 1; j < count.length; j++) {
                if(count[i] < count[j]) {
                    int tmp = count[i];
                    count[i] = count[j];
                    count[j] = tmp;
                    char ctmp = (char)cs[i];
                    cs[i] = cs[j];
                    cs[j] = ctmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(i = 0; i < count.length; i++) {
            int j = count[i];
            char c = (char)cs[i];
            while(j-- > 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
