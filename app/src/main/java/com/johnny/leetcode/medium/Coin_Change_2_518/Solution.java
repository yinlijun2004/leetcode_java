package com.johnny.leetcode.medium.Coin_Change_2_518;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/12.
 */


public class Solution {
    /**
     * 动态规划2
     * @param amount
     * @param coins
     * @return
     */
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; i++) {
            for(int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

    /**
     * 动态规划1
     * @param amount
     * @param coins
     * @return
     */
    /*
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];
        dp[0][0] = 1;
        for(int i = 0; i < coins.length; i++) {
            dp[0][i] = 1;
        }
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                //包含硬币j的种类
                int x = (i-coins[j] >= 0)? dp[i - coins[j]][j]: 0;

                //不包含硬币j的种类
                int y = (j >= 1)? dp[i][j-1]: 0;
                dp[i][j] = x + y;
            }
        }

        return dp[amount][coins.length - 1];
    }
    */



    /**
     * 递归方法。
     * 每个n的换算方法, 包括含第m个硬币的换算方法数 加上 不存在第m个硬币的换算方法数。
     * 会超时，里面存在重复计算。
     * @param amount
     * @param coins
     * @return
     */
    /*
    public int change(int amount, int[] coins) {
        return changeInner(coins, coins.length, amount);
    }
    private int changeInner(int[] coins, int m, int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0 || m == 0) {
            return 0;
        }

        return changeInner(coins, m - 1, n) + changeInner(coins, m, n - coins[m - 1]);
    }
    */
}

