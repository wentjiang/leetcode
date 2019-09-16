package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentaojiang
 * @date 2019/9/16 8:46 PM
 * @description
 */
public class Question40Test {

    private Question40 question40;

    @Before
    public void setUp() throws Exception {
        question40 = new Question40();
    }

    @Test
    public void combinationSum2() {
        System.out.println(question40.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    @Test
    public void combinationSum3() {
        System.out.println(question40.combinationSum2(new int[]{2,5,2,1,2}, 5));
    }
}