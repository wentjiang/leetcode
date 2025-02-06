package com.wentjiang.leetcode.q101_200;

public class Question134 {
    /**
     * 方法1: 暴力求解法,循环遍历
     * 方法2: 首先保证总汽油大于总路程, 再从头遍历,如果油大于路程,可以作为开始节点进行判断,如果判断到末尾,还需要继续判断之前的节点是否能够跑完
     */

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }

        int retainGas = 0;
        int costGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            retainGas += gas[i];
            costGas += cost[i];
            if (retainGas < costGas) {
                start = i + 1;
                retainGas = 0;
                costGas = 0;
            }
        }

        for (int i = 0; i < start; i++) {
            retainGas += gas[i];
            costGas += cost[i];
            if (retainGas < costGas) {
                return -1;
            }
        }
        return start;
    }
}
