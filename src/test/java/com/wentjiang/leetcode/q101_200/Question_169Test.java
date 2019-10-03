package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wentao.jiang
 * @date 2019/10/3 9:38 PM
 * @description
 */
public class Question_169Test {

    private Question_169 question_169;

    @Before
    public void setUp() throws Exception {
        question_169 = new Question_169();
    }

    @Test
    public void majorityElement() {
        Assert.assertEquals(2, question_169.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    public void majorityElement1() {
        Assert.assertEquals(3, question_169.majorityElement(new int[]{3, 2, 3}));
    }
}