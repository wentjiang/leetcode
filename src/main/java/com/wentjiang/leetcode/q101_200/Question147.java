package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;

/**
 * @author wentao.jiang
 * 
 * @date 2020/11/20 12:00 PM
 * 
 * @description 画图解决这些问题比较方便,在纸上画出对应的case的跳转关系
 */
public class Question147 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode current = head;
        ListNode pre = current;
        current = current.next;
        while (current != null) {
            // 比前一个小的情况,需要插入排序
            if (current.val < pre.val) {

                ListNode innerCurrent = first;
                ListNode innerPre = first;
                int innerIndex = 0;
                while (innerCurrent.next != null) {
                    // 如果符合条件了,移动当前元素的位置
                    if (current.val < innerCurrent.val) {
                        pre.next = current.next;
                        // 插入到首位
                        if (innerIndex == 0) {
                            current.next = first;
                            first = current;
                        } else {
                            // 插入到中间位置
                            current.next = innerCurrent;
                            innerPre.next = current;
                        }
                        // 将当前指针,移动到需要的位置
                        current = pre.next;
                        break;
                    }
                    if (innerIndex != 0) {
                        innerPre = innerPre.next;
                    }
                    innerCurrent = innerCurrent.next;
                    innerIndex++;
                }
            } else {
                pre = current;
                current = current.next;
            }
        }
        return first;
    }
}
