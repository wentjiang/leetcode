package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/8/27 7:08 PM
 * 
 * @description
 */
public class Question14Test {

    private Question14 question14 = new Question14();

    @Test
    public void longestCommonPrefix1() {
        assertEquals("fl", question14.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    @Test
    public void longestCommonPrefix2() {
        assertEquals("", question14.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }

    @Test
    public void longestCommonPrefix3() {
        assertEquals("", question14.longestCommonPrefix(new String[] {}));
    }

    @Test
    public void longestCommonPrefix4() {
        assertEquals("a", question14.longestCommonPrefix(new String[] { "a" }));
    }

    @Test
    public void longestCommonPrefix5() {
        assertEquals("c", question14.longestCommonPrefix(new String[] { "c", "c" }));
    }
}