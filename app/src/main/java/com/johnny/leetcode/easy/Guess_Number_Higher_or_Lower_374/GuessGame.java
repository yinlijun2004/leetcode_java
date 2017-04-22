package com.johnny.leetcode.easy.Guess_Number_Higher_or_Lower_374;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/19.
 */

public class GuessGame {
    private int mTarget;
    public GuessGame(int target) {
        mTarget = target;
    }

    int guess(int n) {
        if(mTarget == n) {
            return 0;
        } else if(mTarget > n) {
            return 1;
        } else {
            return 1;
        }
    }
}
