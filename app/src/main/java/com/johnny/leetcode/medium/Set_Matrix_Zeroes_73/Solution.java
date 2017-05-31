package com.johnny.leetcode.medium.Set_Matrix_Zeroes_73;

import java.util.ArrayList;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        for(int i = 0; i < list.size(); i += 2) {
            int row = list.get(i);
            int col = list.get(i + 1);
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
            for(int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}
