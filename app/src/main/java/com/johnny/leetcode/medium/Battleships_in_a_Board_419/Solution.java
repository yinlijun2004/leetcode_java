package com.johnny.leetcode.medium.Battleships_in_a_Board_419;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/battleships-in-a-board/#/description

public class Solution {
    public int countBattleships(char[][] board) {
        if(board == null) {
            return 0;
        }

        int width = board.length;
        int height = board[0].length;
        int ret = 0;
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++) {
                if(board[i][j] == 'X') {
                    if(i == 0 && j == 0) {
                        ++ret;
                        continue;
                    }
                    if(j == 0 && board[i - 1][j] == '.') {
                        ++ret;
                        continue;
                    }
                    if(i == 0 && board[i][j - 1] == '.') {
                        ++ret;
                        continue;
                    }
                    if(j > 0 && board[i][j-1] == '.' && i > 0 && board[i - 1][j] == '.') {
                        ++ret;
                        continue;
                    }
                }
            }
        }

        return ret;
    }
}