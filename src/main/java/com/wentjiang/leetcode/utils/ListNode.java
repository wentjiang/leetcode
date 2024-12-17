package com.wentjiang.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/27 11:59 AM
 * 
 * @description
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    public int[] toArray() {
        List<Integer> list = new ArrayList<>();
        ListNode current = this;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list.stream().mapToInt(num -> (int) num).toArray();
    }

    @Override
    public String toString() {
        return Arrays.toString(ListNodeUtil.createArrayByListNode(this));
//        if (next == null) {
//            return "ListNode{" + "val=" + val + ", next is null";
//        } else {
//            return "ListNode{" + "val=" + val + ", next.val=" + Arrays.toString(next.toArray()) + '}';
//        }
    }
}
