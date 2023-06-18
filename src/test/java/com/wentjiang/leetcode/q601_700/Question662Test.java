package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Question662Test {

    private final Question662 question662 = new Question662();

    @Test
    public void case1() {
        Assertions.assertEquals(4, question662.widthOfBinaryTree(TreeNode
                .extendedTreeNode2TreeNode(TreeNode.getTreeFromArray(new Integer[] { 1, 3, 2, 5, 3, null, 9 }))));
    }

    @Test
    public void case2() {
        Assertions.assertEquals(7, question662.widthOfBinaryTree(TreeNode.extendedTreeNode2TreeNode(
                TreeNode.getTreeFromArray((new Integer[] { 1, 3, 2, 5, null, null, 9, 6, null, 7 })))));
    }

    @Test
    public void case3() {
        Assertions.assertEquals(2, question662.widthOfBinaryTree(
                TreeNode.extendedTreeNode2TreeNode(TreeNode.getTreeFromArray((new Integer[] { 1, 3, 2, 5 })))));
    }

}