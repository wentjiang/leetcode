package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2020/2/3 9:37 PM
 * @description
 */
public class Question41Test {

    private Question41 question41;

    @Before
    public void setUp() throws Exception {
        question41 = new Question41();
    }

    @Test
    public void firstMissingPositive2() {
        assertEquals(2, question41.firstMissingPositive2(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void firstMissingPositive3() {
        assertEquals(3, question41.firstMissingPositive2(new int[]{2,1}));
    }

    @Test
    public void firstMissingPositive4() {
        assertEquals(1, question41.firstMissingPositive2(new int[]{}));
    }

    @Test
    public void firstMissingPositive5() {
        assertEquals(3, question41.firstMissingPositive2(new int[]{0,1,2}));
    }

    @Test
    public void firstMissingPositive6() {
        assertEquals(2, question41.firstMissingPositive2(new int[]{3,3,1,4,0}));
    }
}