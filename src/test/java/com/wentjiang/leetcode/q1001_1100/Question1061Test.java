package com.wentjiang.leetcode.q1001_1100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1061Test {

    private Question1061 question1061 = new Question1061();

    @Test
    void smallestEquivalentString() {
        Assertions.assertEquals("makkek",question1061.smallestEquivalentString("parker", "morris", "parser"));
    }

    @Test
    void smallestEquivalentString1() {
        Assertions.assertEquals("aauaaaaada",question1061.smallestEquivalentString("leetcode", "programs", "sourcecode"));
    }
}