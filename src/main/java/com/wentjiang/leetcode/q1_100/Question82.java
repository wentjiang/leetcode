package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Question82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(0);
        ListNode tempHead = preHead;
        preHead.next = head;
        Map<Integer, Integer> countMap = new HashMap<>();

        while (head != null) {
            countMap.put(head.val, countMap.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        head = preHead.next;
        while (head != null) {
            if (countMap.get(head.val) > 1) {
                preHead.next = head.next;
            } else {
                preHead = head;
            }
            head = head.next;
        }
        return tempHead.next;
    }
}
