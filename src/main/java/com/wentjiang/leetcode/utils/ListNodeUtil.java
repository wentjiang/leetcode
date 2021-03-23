package com.wentjiang.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

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

    public static int[] createArrayByListNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
