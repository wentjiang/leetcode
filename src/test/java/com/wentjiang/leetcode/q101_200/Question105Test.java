package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/12 2:15 PM
 * 
 * @description
 */
public class Question105Test {

    private Question105 question105;

    @Before
    public void setUp() throws Exception {
        question105 = new Question105();
    }

    @Test
    public void buildTree() {
        question105.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
    }
}