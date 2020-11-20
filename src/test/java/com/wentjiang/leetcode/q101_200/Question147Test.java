package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question147Test {
    private Question147 question = new Question147();

    @Test
    public void testCase1() {
        ListNode listNode = ListNodeUtil.createListNodeByArray(new int[]{4, 2, 1, 3});
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, question.insertionSortList(listNode).toArray());
    }
}
