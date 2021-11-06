package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/9 2:57 PM
 * 
 * @description
 */
public class Question23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        boolean hasNext = Stream.of(lists).anyMatch(Objects::nonNull);
        while (hasNext) {
            int minIndex = -1;
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < minValue) {
                    minIndex = i;
                    minValue = lists[i].val;
                }
            }
            ListNode first = lists[minIndex];
            first = first.next;
            lists[minIndex] = first;
            tail.next = new ListNode(minValue);
            tail = tail.next;
            hasNext = Stream.of(lists).anyMatch(Objects::nonNull);
        }
        return head.next;
    }
}
