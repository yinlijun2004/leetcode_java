package com.johnny.leetcode.easy.Reverse_Vowels_of_a_String_345;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/reverse-vowels-of-a-string/#/description

public class Solution {
    public String reverseVowels(String s) {
        char[] co = s.toCharArray();
        char[] cs = s.toLowerCase().toCharArray();
        String vowels = "aeiou";
        int left = 0;
        int right = cs.length - 1;
        for(; left < right;) {
            while(vowels.indexOf(cs[left]) < 0 && left < right) {
                left++;
            }
            if(left == right) {
                break;
            }
            while(vowels.indexOf(cs[right]) < 0 && left < right) {
                right--;
            }
            if(left == right) {
                break;
            }
            char c = co[left];
            co[left] = co[right];
            co[right] = c;
            left++;
            right--;
        }
        return new String(co);
    }
}
