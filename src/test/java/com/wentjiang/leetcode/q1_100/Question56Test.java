package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/15 2:13 PM
 * 
 * @description
 */
public class Question56Test {

    private Question56 question56;

    @Before
    public void setUp() throws Exception {
        question56 = new Question56();
    }

    @Test
    public void merge() {
        question56.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });
    }
}