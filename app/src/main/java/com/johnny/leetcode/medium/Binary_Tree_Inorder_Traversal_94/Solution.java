package com.johnny.leetcode.medium.Binary_Tree_Inorder_Traversal_94;

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by 莉军 on 2017/6/4.
 */

public class Solution {
    /**
     * 非递归解法，利用Stack保存访问过的节点。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            while(!stack.empty()) {
                TreeNode node = stack.peek();
                while(node.left != null) {
                    TreeNode left = node.left;
                    stack.push(left);
                    node.left = null;
                    node = left;
                }
                node = stack.pop();
                list.add(node.val);
                if(node.right != null) {
                    stack.push(node.right);
                }
            }
        }
        return list;
    }
    private void inorder(TreeNode node, List<Integer> list) {
        if(node.left != null) {
            inorder(node.left, list);
        }
        list.add(node.val);
        if(node.right != null) {
            inorder(node.right, list);
        }
    }

    /**
     * 常规递归解法。
     * @param root
     * @return
     */
    /*
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root != null) {
            inorder(root, list);
        }
        return list;
    }
    */
}
