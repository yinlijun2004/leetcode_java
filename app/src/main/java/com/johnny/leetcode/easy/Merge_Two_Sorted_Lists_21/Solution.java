package com.johnny.leetcode.easy.Merge_Two_Sorted_Lists_21;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/13.
 */
//https://leetcode.com/problems/merge-two-sorted-lists/#/description

import com.johnny.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = null;
        ListNode pNewHead = null;
        if(l1 == null && l2 != null) {
            return l2;
        }
        if(l2 == null && l1 != null) {
            return l1;
        }

        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                if(newHead == null) {
                    newHead = l2;
                    pNewHead = newHead;
                } else {
                    pNewHead.next = l2;
                    pNewHead = l2;
                }
                l2 = l2.next;
            } else {
                if(newHead == null) {
                    newHead = l1;
                    pNewHead = newHead;
                } else {
                    pNewHead.next = l1;
                    pNewHead = l1;
                }
                l1 = l1.next;
            }
        }
        if(l1 != null) {
            pNewHead.next =l1;
        }
        if(l2 != null) {
            pNewHead.next = l2;
        }

        return newHead;
    }
}