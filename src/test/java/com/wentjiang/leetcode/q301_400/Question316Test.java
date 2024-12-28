package com.wentjiang.leetcode.q301_400;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question316Test {

    Question316 question316 = new Question316();

    @Test
    void removeDuplicateLetters() {
        String result = question316.removeDuplicateLetters("bcabc");
        Assertions.assertEquals("abc", result);
    }


    @Test
    void removeDuplicateLetters1() {
        String result = question316.removeDuplicateLetters("cbacdcbc");
        Assertions.assertEquals("acdb", result);
    }

    @Test
    void removeDuplicateLetters2() {
        String result = question316.removeDuplicateLetters("cdadabcc");
        Assertions.assertEquals("adbc", result);
    }

    @Test
    void removeDuplicateLetters3() {
        String result = question316.removeDuplicateLetters("abacb");
        Assertions.assertEquals("abc", result);
    }

}