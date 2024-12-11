package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/16 10:15 AM
 * 
 * @description
 */
public class Question38Test {

    private Question38 question38 = new Question38();

    @Test
    public void countAndSay() {
        assertEquals("1", question38.countAndSay(1));
    }

    @Test
    public void countAndSay1() {
        assertEquals("1211", question38.countAndSay(4));
    }
}