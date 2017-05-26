package com.johnny.leetcode.medium.Reorder_List_143;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/26.
 */

public class Solution {

    private void mergeList(ListNode left, ListNode right) {
        ListNode saveLeft = left;
        ListNode node = right;
        while(left.next != null && right != null) {
            node = right;
            right = right.next;
            node.next = left.next;
            left.next = node;
            left = node.next;
        }

        if(left != null) {
            left.next = right;
        }
    }

    private ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        head = head.next;
        newHead.next = null;
        while(head != null) {
            ListNode node = head;
            head = head.next;
            node.next = newHead;
            newHead = node;

        }
        return newHead;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        int len = 0;
        ListNode node = head;
        while(node != null) {
            node = node.next;
            ++len;
        }
        len = len / 2;
        ListNode second = head;
        while(--len > 0) {
            second = second.next;
        }

        ListNode firstTail = second;
        second = second.next;
        firstTail.next = null;
        second = reverseList(second);

        mergeList(head, second);
    }
}