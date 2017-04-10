package com.johnny.leetcode.easy.Longest_Palindrome_409;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/longest-palindrome/#/description

public class Solution {
    public int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        ArrayList<Integer> list = new ArrayList<>();
        char c = chars[0];
        int n = 1;
        for(int i = 1; i < chars.length; i++) {
            if(c == chars[i]) {
                ++n;
            } else {
                list.add(n);
                n = 1;
                c = chars[i];
            }
        }
        list.add(n);

        int num = 0;
        boolean hasOld = false;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                num += list.get(i);
            } else {
                hasOld = true;
                if(list.get(i) > 1) {
                    num = num + list.get(i) - 1;
                }
            }
        }
        if(hasOld) {
            ++num;
        }
        return num;
    }
}