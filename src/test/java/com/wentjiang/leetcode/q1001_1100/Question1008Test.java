package com.wentjiang.leetcode.q1001_1100;

import com.wentjiang.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1008Test {

    private Question1008 question1008 = new Question1008();

    @Test
    void bstFromPreorder() {
        TreeNode tree = question1008.bstFromPreorder(new int[]{8,5,1,7,10,12});
        Assertions.assertNotNull(tree);
    }
}