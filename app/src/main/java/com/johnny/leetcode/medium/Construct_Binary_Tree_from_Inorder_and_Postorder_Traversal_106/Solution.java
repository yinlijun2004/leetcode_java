package com.johnny.leetcode.medium.Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal_106;

import com.johnny.leetcode.TreeNode;

import java.util.Arrays;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/31.
 */

public class Solution {
    private int findVal(int[] order, int val) {
        for(int i = 0; i < order.length; i++) {
            if(val == order[i]) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        int len = postorder.length;
        int rootVal = postorder[len - 1];
        TreeNode root = new TreeNode(rootVal);
        if(len == 1) {
            return root;
        }
        int index = findVal(inorder, rootVal);
        int llen = index;
        int rlen = len - index - 1;

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, llen), Arrays.copyOfRange(postorder, 0, llen));

        root.right = buildTree(Arrays.copyOfRange(inorder, llen + 1, len), Arrays.copyOfRange(postorder, llen, len - 1));

        return root;
    }

}
