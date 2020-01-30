package com.wentjiang.leetcode.q101_200;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2020/1/30 12:10 PM
 * @description
 */
public class Question152Test {

    private Question152 question152;
    @Before
    public void setUp() throws Exception {
        question152 = new Question152();
    }

    @Test
    public void maxProduct() {
        assertEquals(6,question152.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    public void maxProduct1() {
        assertEquals(0,question152.maxProduct(new int[]{-2,0,-1}));
    }

    @Test
    public void maxProduct2() {
        assertEquals(2,question152.maxProduct(new int[]{0,2}));
    }
}