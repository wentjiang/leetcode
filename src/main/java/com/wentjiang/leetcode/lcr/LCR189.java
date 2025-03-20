package com.wentjiang.leetcode.lcr;

public class LCR189 {
    public int mechanicalAccumulator(int target) {
        return target > 0 ? target + mechanicalAccumulator(target - 1) : target;
    }
}
