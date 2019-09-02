package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author wentaojiang
 * @date 2019/9/2 3:42 PM
 * @description
 */
public class Question21Test {

    private Question21 question21;

    @Before
    public void setUp() throws Exception {
        question21 = new Question21();
    }

    @Test
    @Ignore
    public void mergeTwoLists() {
        Question21.ListNode l1 = Question21.getListNode(new int[]{1, 2, 4});
        Question21.ListNode l2 = Question21.getListNode(new int[]{1, 3, 4});
        Question21.ListNode result = question21.mergeTwoLists(l1, l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }


}