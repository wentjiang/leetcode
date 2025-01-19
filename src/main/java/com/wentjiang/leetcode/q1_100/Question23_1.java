package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question23_1 {
    /**
     * 使用优先队列解决该问题
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode preHead = new ListNode(-1);
        ListNode current = preHead;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode head : lists) {
            if (head != null) {
                queue.offer(head);
            }
        }
        while (!queue.isEmpty()) {
            ListNode t = queue.poll();
            current.next = t;
            current = t;
            if (t.next != null) {
                queue.offer(t.next);
            }
        }
        return preHead.next;
    }
}
