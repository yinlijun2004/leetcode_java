package com.johnny.leetcode.medium.Coin_Change_2_518;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import junit.framework.AssertionFailedError;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/15.
 */
public class SolutionTest {
    @Test
    public void change() throws Exception {
        int amount = 200;
        int[] coins = {1,2,5,7,9};
        Solution solution = new Solution();
        int ret = solution.change(amount, coins);
        int ret1 = solution.change1(amount, coins);
        if(ret != ret1) {
            throw new AssertionFailedError();
        }
    }
}