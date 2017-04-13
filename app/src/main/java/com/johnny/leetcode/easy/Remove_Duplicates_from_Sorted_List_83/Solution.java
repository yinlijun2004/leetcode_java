package com.johnny.leetcode.easy.Remove_Duplicates_from_Sorted_List_83;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/12.
 */

import com.johnny.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description

public class Solution {
    private ListNode doDeleteNextDup(ListNode node) {
        if(node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
                return node;
            }
        }
        return node.next;
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null) {
            node = doDeleteNextDup(node);
        }
        return head;
    }
}