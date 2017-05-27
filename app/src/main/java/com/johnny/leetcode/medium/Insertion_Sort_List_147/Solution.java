package com.johnny.leetcode.medium.Insertion_Sort_List_147;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/26.
 */
//https://leetcode.com/problems/insertion-sort-list/#/description

public class Solution {
    private ListNode insert(ListNode head, ListNode node) {
        if(head == null) {
            return node;
        }

        if(node.val < head.val) {
            node.next = head;
            return node;
        }

        ListNode saveHead = head;
        ListNode headNext = head.next;
        while(headNext != null && node.val > headNext.val) {
            head = head.next;
            headNext = head.next;
        }

        head.next = node;
        node.next = headNext;
        return saveHead;
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead = null;

        while(head != null) {
            ListNode node = head;
            head = head.next;
            node.next = null;
            newHead = insert(newHead, node);
        }
        return newHead;
    }
}