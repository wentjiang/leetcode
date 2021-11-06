package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/30 7:27 PM
 * 
 * @description
 */
public class Question153Test {

    private Question153 question153;

    @Before
    public void setUp() throws Exception {
        question153 = new Question153();
    }

    @Test
    public void findMin() {
        assertEquals(1, question153.findMin(new int[] { 3, 4, 5, 1, 2 }));
    }

    @Test
    public void findMin1() {
        assertEquals(0, question153.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
    }
}