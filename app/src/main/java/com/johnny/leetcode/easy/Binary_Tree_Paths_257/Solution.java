package com.johnny.leetcode.easy.Binary_Tree_Paths_257;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/14.
 */
//https://leetcode.com/problems/binary-tree-paths/#/description

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
    private void travelTree(TreeNode node, String prev, List<String> list) {
        if(node.left == null && node.right == null) {
            list.add(prev);
            return;
        }
        if(node.left != null && node.right != null) {
            travelTree(node.left, prev + "->" + node.left.val, list);
            //copy the string
            travelTree(node.right, new String(prev) + "->" + node.right.val, list);
        } else if(node.left != null) {
            travelTree(node.left, prev + "->" + node.left.val, list);
        } else if(node.right != null) {
            travelTree(node.right, prev + "->" + node.right.val, list);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null) {
            return list;
        }
        travelTree(root, String.valueOf(root.val), list);

        return list;
    }
}