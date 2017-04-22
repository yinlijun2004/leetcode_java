package com.johnny.leetcode.easy.Word_Pattern_290;

import java.util.HashMap;
import java.util.Map;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null || pattern.length() == 0 || str.length() == 0) {
            return false;
        }

        char[] cs = pattern.toCharArray();
        String[] ss = str.split(" ");
        if(ss.length != cs.length) {
            return false;
        }
        if(ss.length == 0 || cs.length == 0) {
            return false;
        }

        int[] hash = new int[256];
        int[] hashCS = new int[cs.length];
        int hashIndex = 0;
        for(int i=0; i < cs.length; i++) {
            if(hash[cs[i]] == 0) {
                hash[cs[i]] = hashCS[i] = ++hashIndex;
            } else {
                hashCS[i] = hash[cs[i]];
            }
        }
        int[] hashSS = new int[ss.length];
        Map hash2 = new HashMap<String, Integer>();
        hashIndex = 0;
        for(int i = 0; i < ss.length; i++) {
            if(!hash2.containsKey(ss[i])) {
                hashSS[i] = ++hashIndex;
                hash2.put(ss[i], hashIndex);
            } else {
                hashSS[i] = (int)hash2.get(ss[i]);
            }
        }
        for(int i = 0; i < ss.length; i++) {
            if(hashCS[i] != hashSS[i]) {
                return false;
            }
        }
        return true;
    }
}