package com.johnny.leetcode.medium.Rotate_List_61;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/24.
 */

//https://leetcode.com/problems/rotate-list/#/description
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }

        int len = 0;
        ListNode tmp = head;
        while(tmp != null) {
            ++len;
            tmp = tmp.next;
        }
        k %= len;
        if(k == 0) {
            return head;
        }
        k = len - k;

        ListNode mid = head;
        while(--k > 0) {
            mid = mid.next;
        }

        ListNode newHead = mid.next;
        ListNode tail = mid.next;
        mid.next = null;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }
}