package com.wentjiang.leetcode.q101_200;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/12 9:44 PM
 * 
 * @description
 */
public class Question120Test {

    private Question120 question120;

    @Before
    public void setUp() throws Exception {
        question120 = new Question120();
    }

    @Test
    public void minimumTotal() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(-1));
        triangle.add(Arrays.asList(2, 3));
        triangle.add(Arrays.asList(1, -1, -1));
        Assert.assertEquals(0, question120.minimumTotal(triangle));
    }
}