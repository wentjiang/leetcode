package com.wentjiang.leetcode.practice;

import com.wentjiang.leetcode.utils.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CompletePackage_2Test {

    private CompletePackage_2 completePackage = new CompletePackage_2();

    @Test
    public void case1() {
        Integer[][] array = {{5, 10}, {3, 1}};
        ArrayList<Integer> result = completePackage.knapsack(6, 2, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[]{10, 2}, new int[]{result.get(0), result.get(1)});
    }

    @Test
    public void case2() {
        Integer[][] array = {{3, 10}, {9, 1}, {10, 1}};
        ArrayList<Integer> result = completePackage.knapsack(8, 3, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[]{20, 0}, new int[]{result.get(0), result.get(1)});
    }

    @Test
    public void case3() {
        Integer[][] array = {{13, 189}, {17, 360}, {19, 870}, {14, 184}, {6, 298}, {16, 242}};
        ArrayList<Integer> result = completePackage.knapsack(13, 6, ArrayUtil.convertArrayToList2(array));
        Assertions.assertArrayEquals(new int[]{596, 189}, new int[]{result.get(0), result.get(1)});
    }


}