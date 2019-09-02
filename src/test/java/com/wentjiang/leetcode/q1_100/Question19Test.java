package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/2 8:00 PM
 * @description
 */
public class Question19Test {

    private Question19 question19;

    @Before
    public void setUp() throws Exception {
        question19 = new Question19();
    }

    @Test
    public void removeNthFromEnd1() {
        Question19.ListNode listNode = Question19.getListNode(new int[]{1,2});
        listNode = question19.removeNthFromEnd(listNode, 1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void removeNthFromEnd2() {
        Question19.ListNode listNode = Question19.getListNode(new int[]{1});
        listNode = question19.removeNthFromEnd(listNode, 1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void removeNthFromEnd3() {
        Question19.ListNode listNode = Question19.getListNode(new int[]{1,2,3,4,5});
        listNode = question19.removeNthFromEnd(listNode, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}