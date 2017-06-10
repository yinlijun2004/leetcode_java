package com.johnny.leetcode.medium.Diagonal_Traverse_498;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/10.
 */

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }

        int col = matrix[0].length;
        int row = matrix.length;
        int max = col * col + row * row;
        boolean d2u = true;
        int[] result = new int[col * row];
        int k = 0;
        for(int m = 0, n = 0; m < row && n < col;) {
            result[k++] = matrix[m][n];
            if(d2u) {
                m -=1;
                n += 1;
            } else {
                m += 1;
                n -= 1;
            }

            if(d2u) {
                if(m == -1 && n == col) {
                    m = 1;
                    n = col - 1;
                    d2u = !d2u;
                } else if(m == -1) {
                    m = 0;
                    d2u = !d2u;
                } else if(n == col) {
                    m += 2;
                    n = col - 1;
                    d2u = !d2u;
                }
            } else {
                if(m == row && n == -1) {
                    n = 1;
                    m = row - 1;
                    d2u = !d2u;
                } else if(n == -1) {
                    n = 0;
                    d2u = !d2u;
                } else if(m == row) {
                    n += 2;
                    m = row - 1;
                    d2u = !d2u;
                }
            }

        }

        return result;
    }
}
