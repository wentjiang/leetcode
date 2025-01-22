package com.wentjiang.leetcode.q701_800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question785Test {

    private Question785 question785 = new Question785();

    @Test
    void isBipartite() {
        Assertions.assertTrue(question785.isBipartite(new int[][]{{1}, {0, 3}, {3}, {1, 2}}));
    }

    @Test
    void isBipartite1() {
        Assertions.assertFalse(question785.isBipartite(new int[][]{{1,2,3},{0,2},{0,1,3},{0,2}}));
    }


    @Test
    void isBipartite2() {
        Assertions.assertTrue(question785.isBipartite(new int[][]{{3},{2,4},{1},{0,4},{1,3}}));
    }

}