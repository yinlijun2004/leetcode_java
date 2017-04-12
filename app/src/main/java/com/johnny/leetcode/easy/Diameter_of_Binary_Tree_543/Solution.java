package com.johnny.leetcode.easy.Diameter_of_Binary_Tree_543;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */
//https://leetcode.com/problems/diameter-of-binary-tree/#/description

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
    int longestDepth = 0;

    private int getLongestDepth(TreeNode node) {
        if(node.left == null && node.right == null) {
            return node.val;
        }

        int leftDepth = node.val;
        if(node.left != null) {
            node.left.val = node.val + 1;
            leftDepth = getLongestDepth(node.left);
        }
        int rightDepth = node.val;
        if(node.right != null) {
            node.right.val = node.val + 1;
            rightDepth = getLongestDepth(node.right);
        }
        longestDepth = Math.max(longestDepth, leftDepth + rightDepth - 2 * node.val);

        return Math.max(leftDepth, rightDepth);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root != null) {
            root.val = 1;
            getLongestDepth(root);
        }
        return longestDepth;
    }
}