package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentao.jiang
 * 
 * @date 2019/9/19 11:48 AM
 * 
 * @description
 */
public class Question43Test {

    private Question43 question43 = new Question43();

    @Test
    public void multiply() {
        assertEquals("6", question43.multiply("2", "3"));
    }

    @Test
    public void multiply1() {
        assertEquals("56088", question43.multiply("123", "456"));
    }

    @Test
    public void multiply3() {
        assertEquals("81", question43.multiply("9", "9"));
    }

    @Test
    public void multiply4() {
        assertEquals("121932631112635269", question43.multiply("123456789", "987654321"));
    }

    @Test
    public void multiply5() {
        assertEquals("7901234568", question43.multiply("8", "987654321"));
    }

    @Test
    public void add() {
        assertEquals("10821521012635269", question43.addSum("9876543120000000", "944977892635269"));
    }
    // 10821521012635269
    // 108215201012635269
}