package com.wentjiang.leetcode.practice.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1Question2_2Test {

    private Day1Question2_2 day1Question2 = new Day1Question2_2();

    @Test
    public void case1() {
        int result = day1Question2.longestSubString("");
        Assertions.assertEquals(0, result);
    }

    @Test
    public void case2() {
        int result = day1Question2.longestSubString("abc");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void case3() {
        int result = day1Question2.longestSubString("a");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void case4() {
        int result = day1Question2.longestSubString("abababab");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void case5() {
        int result = day1Question2.longestSubString("ababcabab");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void case6() {
        int result = day1Question2.longestSubString("ababcabcdab");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void case7() {
        int result = day1Question2.longestSubString("abcdebcabcdab");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case8() {
        int result = day1Question2.longestSubString("bcabcdababcde");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case9() {
        int result = day1Question2.longestSubString("bcababcdecdab");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case10() {
        int result = day1Question2.longestSubString("bcababcdeabcdefcdab");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void case11() {
        int result = day1Question2.longestSubString("aabbcc");
        Assertions.assertEquals(2, result);
    }

    @Test
    public void case12(){
        int result = day1Question2.longestSubString("qrsvbspk");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case13(){
        int result = day1Question2.longestSubString("abcdecfg");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case14(){
        int result = day1Question2.longestSubString("tmmzuxt");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void case15(){
        int result = day1Question2.longestSubString("bcbcd");
        Assertions.assertEquals(3, result);
    }

}
