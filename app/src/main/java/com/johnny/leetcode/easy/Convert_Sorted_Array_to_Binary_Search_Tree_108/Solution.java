package com.johnny.leetcode.easy.Convert_Sorted_Array_to_Binary_Search_Tree_108;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/#/description

import com.johnny.leetcode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void inputArrayToTree(int[] nums, int left, int right, TreeNode node) {
        if(left == right) {
            node.val = nums[left];
            return;
        }
        int m = (left + right) / 2;
        node.val = nums[m];
        if(m > left) {
            TreeNode ln = new TreeNode(0);
            node.left = ln;
            inputArrayToTree(nums, left, m - 1, ln);
        }
        if(m < right) {
            TreeNode rn = new TreeNode(0);
            node.right = rn;
            inputArrayToTree(nums, m + 1, right, rn);
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(0);
        inputArrayToTree(nums, 0, nums.length - 1, root);
        return root;
    }
}
