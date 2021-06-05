package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class Question203Test {

    private Question203 question203 = new Question203();

    @Test
    public void removeElements() {
        ListNode result = question203.removeElements(ListNodeUtil.createListNodeByArray(new int[]{1, 2, 6, 3, 4, 5, 6}), 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, ListNodeUtil.createArrayByListNode(result));
    }
}