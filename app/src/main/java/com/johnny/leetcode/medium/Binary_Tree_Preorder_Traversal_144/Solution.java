package com.johnny.leetcode.medium.Binary_Tree_Preorder_Traversal_144;

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
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if(root != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            while(!stack.empty()) {
                TreeNode node = stack.pop();
                while(node != null) {
                    list.add(node.val);
                    if(node.right != null) {
                        stack.push(node.right);
                    }
                    node = node.left;
                }
            }
        }
        return list;
    }
    private void preorder(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if(node.left != null) {
            preorder(node.left, list);
        }
        if(node.right != null) {
            preorder(node.right, list);
        }
    }

    /**
     * 常规递归解法。
     * @param root
     * @return
     */
    /*
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        if(root != null) {
            preorder(root, list);
        }
        return list;
    }
    */
}
