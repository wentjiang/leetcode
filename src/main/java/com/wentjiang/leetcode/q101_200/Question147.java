package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * @author wentao.jiang
 * @date 2020/1/27 12:00 PM
 * @description
 */
public class Question147 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode pre = head;
        ListNode current = head;

        while (current.next != null){
            current = current.next;
            if (current.val < pre.val){
//                ListNode temp
                //todo
            }else{
                pre = pre.next;
            }
        }

        return first;
    }

}
