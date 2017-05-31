package com.johnny.leetcode.medium.Search_a_2D_Matrix_74;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    private boolean binSearch(int[] list, int target, int s, int e) {
        if(s > e) {
            return false;
        }
        int mid = (s + e) / 2;
        int n = list[mid];
        if(n == target) {
            return true;
        } else if(n > target) {
            return binSearch(list, target, s, mid - 1);
        } else {
            return binSearch(list, target, mid + 1, e);
        }
    }

    private int[] binSearchArray(int[][] matrix, int target, int s, int e) {
        if(s > e) {
            return null;
        }
        int mid = (s + e) / 2;
        int[] list = matrix[mid];
        if(list[0] > target) {
            return binSearchArray(matrix, target, s, mid - 1);
        } else if(list[list.length - 1] < target){
            return binSearchArray(matrix, target, mid + 1, e);
        } else {
            return list;
        }
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int[] list = binSearchArray(matrix, target, 0, matrix.length - 1);
        if(list == null) {
            return false;
        }
        return binSearch(list, target, 0, list.length - 1);
    }
}
