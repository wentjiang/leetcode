package com.wentjiang.leetcode.utils;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void createTreeFromArray() {
        TreeNode root = TreeNode.createTreeFromArray(new Integer[]{0, 1, 2});
        Assertions.assertEquals("[0,1,null,null,2,null,null]", root.toString());
    }

    @Test
    public void testToString() {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        Assertions.assertEquals("[0,1,null,null,2,null,null]", root.toString());
    }
}