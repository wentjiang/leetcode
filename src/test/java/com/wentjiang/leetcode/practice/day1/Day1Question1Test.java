package com.wentjiang.leetcode.practice.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day1Question1Test {

    private Day1Question1 day1Question1 = new Day1Question1();

    @Test
    public void case1(){
        boolean result = day1Question1.bracketMatch("");
        Assertions.assertTrue(result);
    }

    @Test
    public void case2(){
        boolean result = day1Question1.bracketMatch("()");
        Assertions.assertTrue(result);
    }

    @Test
    public void case3(){
        boolean result = day1Question1.bracketMatch("{[()]}");
        Assertions.assertTrue(result);
    }


    @Test
    public void case4(){
        boolean result = day1Question1.bracketMatch("{}[()]");
        Assertions.assertTrue(result);
    }

    @Test
    public void case5(){
        boolean result = day1Question1.bracketMatch("{[}()]");
        Assertions.assertFalse(result);
    }

    @Test
    public void case6(){
        boolean result = day1Question1.bracketMatch("()[]{}");
        Assertions.assertTrue(result);
    }

    @Test
    public void case7(){
        boolean result = day1Question1.bracketMatch("(]");
        Assertions.assertFalse(result);
    }

}