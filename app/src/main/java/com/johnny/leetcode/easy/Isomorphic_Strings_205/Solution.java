package com.johnny.leetcode.easy.Isomorphic_Strings_205;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/isomorphic-strings/#/description

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }
        int[] hash = new int[256];
        int[] hashS = new int[s.length()];
        int hashValue = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hash[c] == 0) {
                hashS[i] = hash[c] = ++hashValue;
            } else {
                hashS[i] = hash[c];
            }
        }
        hash = new int[256];
        int[] hashT = new int[s.length()];
        hashValue = 0;
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(hash[c] == 0) {
                hashT[i] = hash[c] = ++hashValue;
            } else {
                hashT[i] = hash[c];
            }
        }
        for(int i = 0; i < s.length(); i++) {
            if(hashT[i] != hashS[i]) {
                return false;
            }
        }
        return true;
    }
}