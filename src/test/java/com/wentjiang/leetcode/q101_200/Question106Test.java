package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/11/9 11:27 AM
 * @description
 */
public class Question106Test {

    private Question106 question106;

    @Before
    public void setUp() throws Exception {
        question106 = new Question106();
    }

    @Test
    public void buildTree() {
        question106.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
    }
}