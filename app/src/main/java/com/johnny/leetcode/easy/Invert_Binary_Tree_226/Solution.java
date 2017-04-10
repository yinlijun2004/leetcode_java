package com.johnny.leetcode.easy.Invert_Binary_Tree_226;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/10.
 */
//https://leetcode.com/problems/invert-binary-tree/#/description

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
    private void travelTree(TreeNode node) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        node.left = right;
        node.right = left;
        if(node.left != null) {
            travelTree(node.left);
        }
        if(node.right != null) {
            travelTree(node.right);
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root != null) {
            travelTree(root);
        }
        return root;
    }
}
