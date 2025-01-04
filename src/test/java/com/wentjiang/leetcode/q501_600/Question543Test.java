package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question543Test {

    private Question543 question543 = new Question543();

    @Test
    void diameterOfBinaryTree() {
        assertEquals(3, question543.diameterOfBinaryTree(TreeNode.createTreeFromArray(new Integer[]{1, 2, 3, 4, 5})));

    }
}