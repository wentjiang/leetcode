package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/26 12:31 PM
 * 
 * @description
 */
public class Question144_1Test {

    private Question144_1 question144_1;

    @Before
    public void setUp() throws Exception {
        question144_1 = new Question144_1();
    }

    @Test
    public void preorderTraversal() {
        Question144_1.TreeNode root = new Question144_1.TreeNode(1);
        Question144_1.TreeNode node1 = new Question144_1.TreeNode(2);
        Question144_1.TreeNode node2 = new Question144_1.TreeNode(3);
        root.right = node1;
        node1.left = node2;

        question144_1.preorderTraversal(root);
    }
}