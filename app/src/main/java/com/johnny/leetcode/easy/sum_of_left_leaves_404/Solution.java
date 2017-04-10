package com.johnny.leetcode.easy.sum_of_left_leaves_404;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/sum-of-left-leaves/#/description

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
    private int sum = 0;
    private void travelTree(TreeNode node) {
        if(node.left != null && node.left.left == null && node.left.right == null) {
            sum += node.left.val;
        }
        if(node.left != null) {
            travelTree(node.left);
        }
        if(node.right != null) {
            travelTree(node.right);
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root != null) {
            travelTree(root);
        }
        return sum;
    }
}
