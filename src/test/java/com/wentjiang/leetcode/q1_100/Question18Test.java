package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/8 10:06 AM
 * 
 * @description
 */
public class Question18Test {

    private Question18_1 question18;

    @Before
    public void setUp() throws Exception {
        question18 = new Question18_1();
    }

    @Test
    public void fourSum1() {
        question18.fourSum(new int[] { 0, 0, 0, 0 }, 1);
    }

    @Test
    public void fourSum2() {
        question18.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
    }
}