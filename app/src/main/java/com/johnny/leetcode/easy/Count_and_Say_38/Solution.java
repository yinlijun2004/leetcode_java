package com.johnny.leetcode.easy.Count_and_Say_38;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/19.
 */
//https://leetcode.com/problems/count-and-say/#/description

public class Solution {
    public String countAndSay(int n) {
        StringBuilder cur = new StringBuilder("1");
        for(int i = 1; i < n; i++) {
            StringBuilder pre = cur;
            cur = new StringBuilder();
            String s = pre.toString();
            char c = s.charAt(0);
            int count = 1;
            for(int j = 1; j < s.length(); j++) {
                if(s.charAt(j) == c) {
                    count++;
                } else {
                    cur.append(count + "" + c);
                    c = s.charAt(j);
                    count = 1;
                }
            }
            cur.append(count + "" + c);
        }
        return cur.toString();
    }
}