package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class Question671Test {

    private Question671 question671 = new Question671();

    @Test
    public void findSecondMinimumValue() {
        TreeNode root = TreeNode.createTreeFromArray(new Integer[]{2, 2, 5, null, null, 5, 7});
        Assertions.assertEquals(5, question671.findSecondMinimumValue(root));
    }

    @Test
    public void findSecondMinimumValue1() {
        TreeNode root = TreeNode.createTreeFromArray(new Integer[]{2, 2, 2});
        Assertions.assertEquals(-1, question671.findSecondMinimumValue(root));
    }

    @Test
    public void findSecondMinimumValue2() {
        TreeNode root = TreeNode.createTreeFromArray(new Integer[]{2, 2, 2147483647});
        Assertions.assertEquals(2147483647, question671.findSecondMinimumValue(root));
    }
}