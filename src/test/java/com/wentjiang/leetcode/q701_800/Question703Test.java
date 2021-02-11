package com.wentjiang.leetcode.q701_800;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Question703Test {

    @Test
    public void test1() {
        Question703.KthLargest kthLargest = new Question703.KthLargest(3, new int[]{4, 5, 8, 2});
        Assertions.assertEquals(4, kthLargest.add(3));
        Assertions.assertEquals(5, kthLargest.add(5));
        Assertions.assertEquals(5, kthLargest.add(10));
        Assertions.assertEquals(8, kthLargest.add(9));
        Assertions.assertEquals(8, kthLargest.add(4));
    }

}