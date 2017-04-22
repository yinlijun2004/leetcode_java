package com.johnny.leetcode.easy.Guess_Number_Higher_or_Lower_374;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/19.
 */
//https://leetcode.com/problems/guess-number-higher-or-lower/#/description

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public Solution(int target) {
        super(target);
    }

    public int guessNumber(int n) {
        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            int ret = guess(mid);
            if(ret == 0) {
                return mid;
            } else if(ret == 1) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }
}
