package com.wentjiang.leetcode.q801_900;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question845Test {

    Question845 question845 = new Question845();

    @Test
    void longestMountain() {
        Assertions.assertEquals(0, question845.longestMountain(new int[] { 2, 2, 2 }));
    }

    @Test
    void longestMountain1() {
        Assertions.assertEquals(5, question845.longestMountain(new int[] { 2, 1, 4, 7, 3, 2, 5 }));
    }

    @Test
    void longestMountain2() {
        Assertions.assertEquals(11, question845.longestMountain(new int[] { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 }));
    }

    @Test
    void longestMountain3() {
        Assertions.assertEquals(4, question845.longestMountain(new int[] { 875, 884, 239, 731, 723, 685 }));
    }

}