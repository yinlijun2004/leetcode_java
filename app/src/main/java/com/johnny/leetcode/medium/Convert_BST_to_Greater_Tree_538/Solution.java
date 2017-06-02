package com.johnny.leetcode.medium.Convert_BST_to_Greater_Tree_538;

import com.johnny.leetcode.TreeNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/2.
 */

public class Solution {
    /**
     * DFS 中序遍历？依次访问右节点、自身节点、左节点。统计累加的值。
     * @param node
     * @param sum
     * @return
     */
    private int travel(TreeNode node, int sum) {
        if(node.right != null) {
            sum = travel(node.right, sum);
        }
        sum += node.val;
        node.val = sum;
        if(node.left != null) {
            sum = travel(node.left, sum);
        }
        return sum;
    }
    public TreeNode convertBST(TreeNode root) {
        if(root != null) {
            travel(root, 0);
        }
        return root;
    }
}