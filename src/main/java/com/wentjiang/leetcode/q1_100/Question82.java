package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Question82 {
    /**
     * 没有考虑到顺序的情况
     */
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

    /**
     * 考虑顺序的情况
     */
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode startNode = new ListNode(0, head);
        startNode.next = head;
        ListNode prePreHead = startNode;
        // 当前节点不为null的情况,向后遍历
        while (head != null) {

        }
        return startNode.next;
    }

}
