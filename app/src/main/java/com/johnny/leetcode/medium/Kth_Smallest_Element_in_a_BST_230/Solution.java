package com.johnny.leetcode.medium.Kth_Smallest_Element_in_a_BST_230;

import com.johnny.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 莉军 on 2017/6/4.
 */

public class Solution {
    /**
     * 中序遍历，第k个节点就是第k小个元素。
     * @param root
     * @param list
     */
    private void inorder(TreeNode root, List<Integer> list) {
        if(root.left != null) {
            inorder(root.left, list);
        }
        list.add(root.val);
        if(root.right != null) {
            inorder(root.right, list);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        return list.get(k - 1);
    }
}
