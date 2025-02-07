package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

public class Question21_1 {
    /**
     * 使用递归求解
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = list1.val <= list2.val ? list1 : list2;
        if (head.val == list1.val) {
            head.next = mergeTwoLists(list1.next, list2);
        } else {
            head.next = mergeTwoLists(list1, list2.next);
        }
        return head;
    }
}
