package com.johnny.leetcode.medium.Add_Two_Numbers_II_445;

import com.johnny.leetcode.ListNode;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/27.
 */
//https://leetcode.com/problems/add-two-numbers-ii/#/description
public class Solution {
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

    /**
     * 反转两个链表，然后相加到一个新链表，然后返回反转新链表。
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverseList(l1);
        ListNode rl2 = reverseList(l2);

        int carray = 0;
        int sum = 0;
        ListNode head = null;
        ListNode pivot = null;
        while(rl1 != null || rl2 != null) {
            int l = 0;
            if(rl1 != null) {
                l = rl1.val;
                rl1 =  rl1.next;
            }
            int r = 0;
            if(rl2 != null) {
                r = rl2.val;
                rl2 = rl2.next;
            }
            sum = carray + l + r;
            ListNode node = new ListNode(sum % 10);
            carray = sum / 10;
            if(head == null) {
                head = node;
                pivot = node;
            } else {
                pivot.next = node;
                pivot = node;
            }
        }

        if(carray > 0) {
            pivot.next = new ListNode(carray);
        }
        return reverseList(head);
    }

    /** 解法2，不反转链表，保存两个链表的元素到两个ArrayList，
     * 然后两个ArrayList相加到一起，最后将ArrayList转化成链表返回。
     * 此方法因为空间超出限制没通过。
     */
    /*
    private int getListLen(ListNode head) {
        ListNode node = head;
        int len = 0;
        while(node != null) {
            ++len;
            node = node.next;
        }
        return len;
    }
    private void fillArrayByList(ListNode head, ArrayList<Integer> list, int from) {
        ListNode node = head;
        for(int i = 0; i < from; i++) {
            list.add(0);
        }
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }
    }
    private int addTwoList(ArrayList<Integer> longList, ArrayList<Integer> shortList) {
        int i = longList.size() - 1;
        int carray = 0;
        int sum  = 0;
        while(i >= 0) {
            sum = longList.get(i) + shortList.get(i) + carray;
            longList.set(i, sum % 10);
            carray = sum / 10;
            i--;
        }
        return carray;
    }

    private ListNode arrayToList(ArrayList<Integer> list) {
        if(list.size() == 0) {
            return null;
        }
        ListNode head = new ListNode(list.get(0));
        ListNode node = head;
        int i = 1;
        while(i < list.size()) {
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = getListLen(l1);
        int len2 = getListLen(l2);
        int longLen = Math.max(len1, len2);
        int shortLen = Math.min(len1, len2);
        System.out.println("shortLen:" + shortLen + " longLen:" + longLen);
        ListNode longList = len1 > len2 ? l1 : l2;
        ListNode shortList = len1 > len2 ? l2 : l1;

        ArrayList<Integer> arrayLong = new ArrayList<Integer>(longLen);
        fillArrayByList(longList, arrayLong, 0);
        ArrayList<Integer> arrayShort = new ArrayList<Integer>(longLen);
        fillArrayByList(shortList, arrayShort, longLen - shortLen);

        int carray = addTwoList(arrayLong, arrayShort);
        if(carray > 0) {
            ListNode head = new ListNode(carray);
            head.next = arrayToList(arrayLong);
            return head;
        } else {
            return arrayToList(arrayLong);
        }
    }
     */
}