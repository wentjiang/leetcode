package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/4 5:37 PM
 * 
 * @description
 */
public class Question6Test {

    private Question6 question6 = new Question6();

    @Test
    public void convert1() {
        assertEquals("LCIRETOESIIGEDHN", question6.convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void convert2() {
        assertEquals("LDREOEIIECIHNTSG", question6.convert("LEETCODEISHIRING", 4));
    }
}