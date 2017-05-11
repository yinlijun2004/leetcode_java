package com.johnny.leetcode.easy.Intersection_of_Two_Linked_Lists_160;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/9.
 */

import com.johnny.leetcode.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//https://leetcode.com/problems/intersection-of-two-linked-lists/#/solutions
public class Solution {
    private int getLength(ListNode node) {
        int ret = 0;
        while(node != null) {
            node = node.next;
            ret++;
        }
        return ret;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);

        if(lenA > lenB) {
            int m = lenA - lenB;
            while(headA != null && m-- > 0) {
                headA = headA.next;
            }
        } else if(lenB > lenA) {
            int m = lenB - lenA;
            while(headB != null && m-- > 0) {
                headB = headB.next;
            }
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}