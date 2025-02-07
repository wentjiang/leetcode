package com.wentjiang.leetcode.q2401_2500;

import com.wentjiang.leetcode.utils.ListNode;
import com.wentjiang.leetcode.utils.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2487Test {

    private Question2487 question2487 = new Question2487();

    @Test
    void removeNodes() {
        ListNode node = ListNodeUtil.createListNodeByArray(new int[]{5, 2, 13, 3, 8});
        ListNode result = question2487.removeNodes(node);
        Assertions.assertArrayEquals(new int[]{13, 8}, ListNodeUtil.createArrayByListNode(result));
    }
}