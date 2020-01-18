package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wentao.jiang
 * @date 2020/1/18 11:30 AM
 * @description
 */
public class Question124Test {

    private Question124 question124;
    private Question124.TreeNode root;

    @Before
    public void setUp() throws Exception {
        question124 = new Question124();
        root = new Question124.TreeNode(1);
        root.left = new Question124.TreeNode(2);
    }

    @Test
    public void maxPathSum() {
        Assert.assertEquals(3, question124.maxPathSum(root));
    }
}