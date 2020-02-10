package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2020/2/5 11:08 PM
 * @description
 */
public class Question45Test {
    private Question45 question45;

    @Before
    public void setUp() throws Exception {
        question45 = new Question45();
    }

    @Test
    public void jump() {
        assertEquals(2, question45.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void jump1() {
        assertEquals(0, question45.jump(new int[]{1}));
    }

    @Test
    public void jump_1() {
        assertEquals(2, question45.jump2(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void jump_1_1() {
        assertEquals(0, question45.jump1(new int[]{1}));
    }

    @Test
    public void jump_1_2() {
        assertEquals(2, question45.jump1(new int[]{2,3,0,1,4}));
    }
}