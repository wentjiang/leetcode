package com.wentjiang.leetcode.q101_200;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/18 11:30 AM
 * 
 * @description
 */
public class Question124Test {

    private static Question124 question124;
    private static Question124.TreeNode root;

    @BeforeAll
    public static void setUp() throws Exception {
        question124 = new Question124();
        root = new Question124.TreeNode(1);
        root.left = new Question124.TreeNode(2);
    }

    @Test
    public void maxPathSum() {
        assertEquals(3, question124.maxPathSum(root));
    }
}