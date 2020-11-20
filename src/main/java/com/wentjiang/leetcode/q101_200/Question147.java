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
        int index = 0;
        while (current.next != null) {
            if (index == 0){
                index++;
            }
            //比前一个小的情况,需要插入排序
            if (current.val < pre.val) {
                ListNode temp = head;
                ListNode tempPre = first;
                int insertIndex = 0;
                while(temp.next != null){
                    if (current.val < temp.val){
                        pre.next = current.next;
                        if (insertIndex == 0){
                            current.next = first;
                            first = current;
                        }else{
                            current.next = temp.next;
                            tempPre.next = current;
                        }
                    }
                    if (insertIndex != 0){
                        tempPre = tempPre.next;
                    }
                    temp = temp.next;
                    insertIndex++;
                }
            } else {
                pre = current;
                current = current.next;
                index++;
            }

        }

        return first;
    }

}
