package com.johnny.leetcode.medium.Unique_Paths_II_63;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    /**
     * 还是动态规划，比Unique_Paths_62的转移条件复杂一些。
     * @param ob
     * @return
     */
    public int uniquePathsWithObstacles(int[][] ob) {
        if(ob == null || ob.length == 0 || ob[0].length == 0) {
            return 0;
        }
        int m = ob.length, n = ob[0].length;
        if(m == 0 || n == 0) {
            return 0;
        }
        if(ob[0][0] == 1) {
            return 0;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 && j == 0) {
                    dp[0][0] = 1;
                } else if(j == 0) {
                    dp[i][j] = ob[i][j] == 1 ? 0 : dp[i - 1][j];
                } else if(i == 0) {
                    dp[i][j] = ob[i][j] == 1 ? 0 : dp[i][j - 1];
                } else {
                    if(ob[i][j] == 1) {
                        dp[i][j] = 0;
                    } else if(ob[i][j - 1] == 1 && ob[i - 1][j] == 1) {
                        dp[i][j] = 0;
                    } else if(ob[i][j - 1] == 1) {
                        dp[i][j] = dp[i - 1][j];
                    } else if(ob[i - 1][j] == 1) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
