package com.wentjiang.leetcode.utils;

public class ListNodeUtil {
    public static ListNode createListNodeByArray(int[] array) {
        if (array.length == 0) {
            return null;
        } else {
            ListNode head = new ListNode(array[0]);
            ListNode current = head;
            for (int i = 1; i < array.length; i++) {
                ListNode newNode = new ListNode(array[i]);
                current.next = newNode;
                current = newNode;
            }
            return head;
        }
    }
}
