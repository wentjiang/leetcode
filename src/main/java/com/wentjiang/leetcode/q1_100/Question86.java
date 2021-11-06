package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question86 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = head;
            } else {
                large.next = head;
                large = head;
            }
            head = head.next;
        }
        small.next = largeHead.next;
        large.next = null;
        head = smallHead.next;
        return head;
    }
}
