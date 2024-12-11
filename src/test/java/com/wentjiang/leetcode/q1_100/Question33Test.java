package com.wentjiang.leetcode.q1_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author wentaojiang
 * 
 * @date 2019/9/13 3:31 PM
 * 
 * @description
 */
public class Question33Test {

    private Question33 question33 = new Question33();

    @Test
    public void search() {
        assertEquals(4, question33.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }

    @Test
    public void search1() {
        assertEquals(-1, question33.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
    }

    @Test
    public void search2() {
        assertEquals(-1, question33.search(new int[] {}, 5));
    }

    @Test
    public void search3() {
        assertEquals(-1, question33.search(new int[] { 1 }, 0));
    }

    @Test
    public void search4() {
        assertEquals(-1, question33.search(new int[] { 3, 5, 1 }, 4));
    }

    @Test
    public void search5() {
        assertEquals(-1, question33.search(new int[] { 1, 3 }, 0));
    }

    @Test
    public void search6() {
        assertEquals(4, question33.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }

    @Test
    public void search7() {
        assertEquals(0, question33.search(new int[] { 1, 3 }, 1));
    }

    @Test
    public void search8() {
        assertEquals(1, question33.search(new int[] { 1, 3 }, 3));
    }

    @Test
    public void search9() {
        assertEquals(3, question33.search(new int[] { 7, 8, 1, 2, 3, 4, 5, 6 }, 2));
    }

}