package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/2 2:51 PM
 * 
 * @description
 */
public class Question21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode header = null;
        boolean firstAdd = true;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                result.next = new ListNode(l2.val);
                result = result.next;
                result.next = l2.next;
                break;
            } else if (l2 == null) {
                result.next = new ListNode(l1.val);
                result = result.next;
                result.next = l1.next;
                break;
            }
            if (l1.val < l2.val) {
                if (result == null) {
                    result = new ListNode(l1.val);
                } else {
                    result.next = new ListNode(l1.val);
                    result = result.next;
                }
                l1 = l1.next;
            } else {
                if (result == null) {
                    result = new ListNode(l2.val);
                } else {
                    result.next = new ListNode(l2.val);
                    result = result.next;
                }
                l2 = l2.next;
            }
            if (firstAdd) {
                header = result;
                firstAdd = false;
            }
        }
        return header;
    }
}
