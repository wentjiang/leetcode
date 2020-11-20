package com.wentjiang.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2020/1/27 11:59 AM
 * @description
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public int[] toArray(){
        List<Integer> list = new ArrayList<>();
        ListNode current = this;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        return list.stream().mapToInt(num -> (int) num).toArray();
    }
}
