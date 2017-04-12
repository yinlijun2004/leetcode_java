package com.johnny.leetcode.easy.Ransom_Note_383;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/ransom-note/#/description

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];

        for(char c : magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()) {
            if(map[c - 'a'] > 0) {
                --map[c - 'a'];
            } else {
                return false;
            }
        }
        return true;
    }
}