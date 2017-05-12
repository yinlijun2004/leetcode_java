package com.johnny.leetcode.easy.Valid_Palindrome_125;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/valid-palindrome/#/description

public class Solution {

    private boolean canSkip(char c) {
        return !Character.isDigit(c) && !Character.isLetter(c);
    }

    /**
     * 双指针相向遍历数组
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] cs = s.toCharArray();
        for(int i = 0, j = cs.length - 1; i < j;) {
            while(i < j && canSkip(cs[i])) {
                ++i;
            }
            if(i == j) {
                return true;
            }

            while(i < j && canSkip(cs[j])) {
                --j;
            }
            if(i == j) {
                return true;
            }
            if(cs[i] != cs[j]) {
                return false;
            }
            ++i;
            --j;

        }
        return true;
    }
}
