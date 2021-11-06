package com.wentjiang.leetcode.q1_100;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/2 4:54 PM
 * 
 * @description
 */
public class Question22Test {

    private Question22 question22;

    @Before
    public void setUp() throws Exception {
        question22 = new Question22();
    }

    @Test
    public void generateParenthesis() {
        List<String> result = question22.generateParenthesis(4);
        System.out.println(result);
        System.out.println(result.size());
    }

    @Test
    public void generateParenthesis1() {
        List<String> result = question22.generateParenthesis1(4);
        System.out.println(result);
        System.out.println(result.size());
    }

    @Test
    public void generateParenthesis2() {
        List<String> result = question22.generateParenthesis2(4);
        System.out.println(result);
        System.out.println(result.size());
    }
}