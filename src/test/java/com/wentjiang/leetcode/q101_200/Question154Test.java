package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/30 7:31 PM
 * 
 * @description
 */
public class Question154Test {

    private Question154 question154;

    @Before
    public void setUp() throws Exception {
        question154 = new Question154();
    }

    @Test
    public void findMin() {
        assertEquals(1, question154.findMin(new int[] { 1, 3, 5 }));
    }

    @Test
    public void findMin1() {
        assertEquals(0, question154.findMin(new int[] { 2, 2, 2, 0, 1 }));
    }
}