package com.johnny.leetcode.medium.Search_a_2D_Matrix_II_240;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/22.
 */
//https://leetcode.com/problems/search-a-2d-matrix-ii/#/description

public class Solution {
    private boolean helper(int[][] matrix, int target, int sc, int lc, int sr, int lr) {
        if(sc > lc || sr > lr) {
            return false;
        }
        if(sc < 0 || sr < 0 || lc >= matrix.length || lr >= matrix[0].length) {
            return false;
        }
        int mc = (sc + lc) / 2;
        if(lc == 1) {
            mc = 1;
        }
        int mr = (sr + lr) / 2;
        if(lr == 1) {
            mr = 1;
        }
        int num = matrix[mc][mr];
        if(num == target) {
            return true;
        } else if(num < target) {
            return helper(matrix, target, mc + 1, lc, sr, lr)
                    || helper(matrix, target, sc, mc, mr + 1, lr);
        } else {
            return helper(matrix, target, sc, mc - 1, sr, lr)
                    || helper(matrix, target, mc, lc, sr, mr - 1);
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        return helper(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }
}
