package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/8 9:51 PM
 * 
 * @description
 */
public class Question24Test {

    private Question24 question24;

    @Before
    public void setUp() throws Exception {
        question24 = new Question24();
    }

    @Test
    public void swapPairs() {
        System.out.println(question24.swapPairs(question24.getListNode(new int[] { 1, 2, 3, 4 })));
        ;
    }
}