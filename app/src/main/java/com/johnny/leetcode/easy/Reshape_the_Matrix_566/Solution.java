package com.johnny.leetcode.easy.Reshape_the_Matrix_566;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null || nums.length == 0 || nums[0].length == 0) {
            return nums;
        }
        int m = nums.length, n = nums[0].length;
        if(m * n != r * c) {
            return nums;
        }
        int idx = 0;
        int[][] result = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                idx = i * c + j;
                int or = idx / n;
                int oc = idx % n;
                result[i][j] = nums[or][oc];
            }
        }
        return  result;
    }
}
