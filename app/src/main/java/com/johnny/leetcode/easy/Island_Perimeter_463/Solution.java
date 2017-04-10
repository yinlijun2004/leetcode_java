package com.johnny.leetcode.easy.Island_Perimeter_463;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/island-perimeter/#/description

public class Solution {
    public int islandPerimeter(int[][] grid) {
        int width = grid.length;
        int height = grid[0].length;
        int perimeter = 0;
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                if(grid[i][j] == 1) {
                    continue;
                }
                if(i - 1 >= 0 && (grid[i-1][j] == 1)) {
                    perimeter++;
                }
                if(i + 1 < width && (grid[i+1][j] == 1)) {
                    perimeter++;
                }
                if(j - 1 >= 0 && (grid[i][j-1] == 1)) {
                    perimeter++;
                }
                if(j + 1 < height && grid[i][j+1] == 1) {
                    perimeter++;
                }
            }
        }
        for(int i = 0; i < width; i++) {
            if(grid[i][0] == 1) {
                perimeter++;
            }
            if(grid[i][height - 1] == 1) {
                perimeter++;
            }
        }
        for(int i = 0; i < height; i++) {
            if(grid[0][i] == 1){
                perimeter++;
            }
            if(grid[width - 1][i] == 1) {
                perimeter++;
            }
        }
        return perimeter;
    }
}
