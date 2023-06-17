package com.wentjiang.leetcode.practice.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day2Question3Test {

    private Day2Question3 day2Question3 = new Day2Question3();

    @Test
    public void case1() {
        Assertions.assertEquals(4, day2Question3.maxWidth(new Integer[] { 1, 3, 2, 5, 3, null, 9 }));
    }

    @Test
    public void case2() {
        Assertions.assertEquals(7, day2Question3.maxWidth(new Integer[] { 1, 3, 2, 5, null, null, 9, 6, null, 7 }));
    }

    @Test
    public void case3() {
        Assertions.assertEquals(2, day2Question3.maxWidth(new Integer[] { 1, 3, 2, 5 }));
    }

    @Test
    public void testPrintTree1() {
        Day2Question3.ExtendedTreeNode root = day2Question3.getTreeFromArray(new Integer[] { 1, 3, 2, 5, 3, null, 9 });
        day2Question3.printTree(root);
    }

    @Test
    public void testPrintTree2() {
        Day2Question3.ExtendedTreeNode root = day2Question3
                .getTreeFromArray(new Integer[] { 1, 3, 2, 5, null, null, 9, 6, null, 7 });
        day2Question3.printTree(root);
    }

    @Test
    public void testPrintTree3() {
        Day2Question3.ExtendedTreeNode root = day2Question3.getTreeFromArray(new Integer[] { 1, 3, 2, 5 });
        day2Question3.printTree(root);
    }

}