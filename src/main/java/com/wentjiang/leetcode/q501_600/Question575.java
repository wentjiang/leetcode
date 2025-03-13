package com.wentjiang.leetcode.q501_600;

import java.util.HashSet;
import java.util.Set;

public class Question575 {
    public int distributeCandies(int[] candyType) {
        int eatCount = candyType.length / 2;
        Set<Integer> candyTypeSet = new HashSet<>();
        for (int type : candyType) {
            candyTypeSet.add(type);
        }
        return Math.min(eatCount, candyTypeSet.size());
    }
}
