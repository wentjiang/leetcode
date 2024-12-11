package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/21 12:50 PM
 * 
 * @description
 */
public class Question67Test {

    private Question67 question67 = new Question67();

    @Test
    public void addBinary() {
        assertEquals("100", question67.addBinary("11", "1"));
    }

    @Test
    public void addBinary2() {
        assertEquals("10101", question67.addBinary("1010", "1011"));
    }
}