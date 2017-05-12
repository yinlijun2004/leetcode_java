package com.johnny.leetcode.medium.Find_Bottom_Left_Tree_Value_513;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/12.
 */

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
    private void travelTree(TreeNode node, int depth, int[] data) {
        if(node.left == null && node.right == null) {
            if(depth > data[0]) {
                data[0] = depth;
                data[1] = node.val;
            }
        }
        if(node.left != null) {
            travelTree(node.left, depth + 1, data);
        }
        if(node.right != null) {
            travelTree(node.right, depth + 1, data);
        }
    }

    /**
     * DFS，先序遍历。
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        int max = root.val;
        int[] data = new int[2];
        //深度
        data[0] = 0;
        //该深度最左边的值
        data[1] = root.val;
        travelTree(root, 1, data);
        return data[1];
    }
}