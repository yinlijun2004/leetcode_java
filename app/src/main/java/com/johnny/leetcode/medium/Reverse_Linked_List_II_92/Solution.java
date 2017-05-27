package com.johnny.leetcode.medium.Reverse_Linked_List_II_92;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/27.
 */

//https://leetcode.com/problems/reverse-linked-list-ii/#/description

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m == n || n <= 1){
            return head;
        }
        ListNode prevH = null;
        --m;
        --n;
        int len = n - m + 1;
        if(m > 0) {
            prevH = head;
            while(--m > 0) {
                prevH = prevH.next;
            }
        }

        ListNode h = prevH == null ? head : prevH.next;
        ListNode newHead = h;
        ListNode newTail = h;
        while(h != null && len-- > 0) {
            ListNode node = h;
            h = h.next;
            node.next = newHead;
            newHead = node;
        }
        newTail.next = h;

        if(prevH != null) {
            prevH.next = newHead;
        } else {
            head = newHead;
        }

        return head;
    }
}