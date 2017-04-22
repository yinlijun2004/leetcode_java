package com.johnny.leetcode.easy.Merge_Sorted_Array_88;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/22.
 */
//https://leetcode.com/problems/merge-sorted-array/#/description

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m];
        System.arraycopy(nums1, 0, nums, 0, m);
        int i = 0;
        int j = 0;
        int k = 0;
        for(; i < m && j < n;) {
            if(nums[i] < nums2[j]) {
                nums1[k++] = nums[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }
        if(i == m && j < n) {
            System.arraycopy(nums2, j, nums1, k, n - j);
        } else if(j == n && i < m) {
            System.arraycopy(nums, i, nums1, k, m - i);
        }
    }
}