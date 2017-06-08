package com.johnny.leetcode.medium.Maximum_Product_of_Word_Lengths_318;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/8.
 */
//https://leetcode.com/problems/maximum-product-of-word-lengths/#/description

public class Solution {
    public int maxProduct(String[] words) {
        int i = 0;
        int[] ints = new int[words.length];
        for(String word : words) {
            char[] cs = word.toCharArray();
            for(char c : cs) {
                ints[i] |= (0x1 << (c - 'a'));
            }
            ++i;
        }

        int max = 0;
        for(i = 0; i < ints.length; i++) {
            for(int j = i + 1; j < ints.length; j++) {
                if((ints[i] & ints[j]) == 0) {
                    if(words[i].length() * words[j].length() > max) {
                        max = words[i].length() * words[j].length();
                    }
                }
            }
        }

        return  max;
    }
}