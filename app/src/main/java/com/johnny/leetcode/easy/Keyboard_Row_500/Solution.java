package com.johnny.leetcode.easy.Keyboard_Row_500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/keyboard-row/#/description

public class Solution {
    private int findRowIndex(char c) {
        final String[] rows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        for(int i = 0; i < rows.length; i++) {
            if(rows[i].indexOf(c) >= 0) {
                return i;
            }
        }
        return -1;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> ret = new ArrayList<>();
        for(String curStr : words) {
            String str = curStr.toLowerCase();
            boolean inOneRow = true;
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int rowIndex = findRowIndex(c);
                set.add(rowIndex);
                if(set.size() > 1) {
                    inOneRow = false;
                    break;
                }
            }
            if(inOneRow) {
                ret.add(curStr);
            }
        }
        return ret.toArray(new String[0]);
    }
}
