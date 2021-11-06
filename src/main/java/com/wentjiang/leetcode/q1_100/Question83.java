package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/23 1:41 PM
 * 
 * @description
 */
public class Question83 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode pre = head;
        ListNode preNext = head.next;
        while (pre.next != null && preNext != null) {
            if (preNext.val == pre.val) {
                pre.next = preNext.next;
                if (preNext.next != null) {
                    preNext = preNext.next;
                }
            } else {
                pre = pre.next;
                preNext = preNext.next;
            }
        }
        return first.next;
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode head = first;

        head.next = new ListNode(1);
        head = head.next;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(3);

        ListNode node = deleteDuplicates(first.next);
        System.out.println(node);
    }
}
