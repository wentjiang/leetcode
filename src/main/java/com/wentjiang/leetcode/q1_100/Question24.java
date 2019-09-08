package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/8 9:50 PM
 * @description
 */
public class Question24 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode current = preHead;
        ListNode t1;
        ListNode t2;
        while (current.next != null && current.next.next != null) {
            ListNode temp = null;
            t1 = current.next;
            t2 = current.next.next;
            current.next = t2;
            temp = t2.next;
            t1.next = temp;
            t2.next = t1;
            current = t1;
        }
        return preHead.next;
    }

    public static ListNode getListNode(int[] nums) {
        ListNode listNode = null;
        ListNode result = null;
        for (int num : nums) {
            if (listNode == null) {
                listNode = new ListNode(num);
                result = listNode;
                continue;
            }
            listNode.next = new ListNode(num);
            listNode = listNode.next;
        }
        return result;
    }
}
