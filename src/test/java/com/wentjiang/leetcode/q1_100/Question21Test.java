package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/2 3:42 PM
 * 
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
        ListNode l1 = ListNodeUtil.createListNodeByArray(new int[] { 1, 2, 4 });
        ListNode l2 = ListNodeUtil.createListNodeByArray(new int[] { 1, 3, 4 });
        ListNode result = question21.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

}