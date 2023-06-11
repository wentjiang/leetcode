package com.wentjiang.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.nowcoder.com/practice/3ed13831e2cc4613866edee237d5a804?tpId=196&tqId=40264&ru=/exam/oj
public class CompletePackage {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param v    int整型 背包体积
     * @param n    int整型 n种物品
     * @param nums int整型ArrayList<ArrayList<>> 每种物品的体积和价格
     * @return int整型ArrayList
     */
    public ArrayList<Integer> knapsack(int v, int n, ArrayList<ArrayList<Integer>> nums) {
        //思路,使用动态规划填满整个DP数组,由于需要考虑恰好装满的问题,需要同时保存当前的重量和当前的价格
        int maxWeight = v;
        ArrayList<ArrayList<Integer>> items = nums;
        int[][] dpArray = new int[n][maxWeight + 1];
        int maxFullValue = 0; //恰好装满的最大值
        for (int itemIndex = 0; itemIndex < n; itemIndex++) {
            int currentItemCount = 1;
            ArrayList<Integer> currentItem = items.get(itemIndex);
            int currentVolume = currentItem.get(0);
            int currentValue = currentItem.get(1);
            for (int totalVolume = 0; totalVolume <= maxWeight; totalVolume++) {
                //当前重量,当前物品以及前边所有物品能装下的最大的情况
                while (currentItemCount * currentVolume <= totalVolume) {
                    currentItemCount++;
                }
                //如果物品id为0,不用考虑上一层的情况
                if (itemIndex == 0) {
                    dpArray[itemIndex][totalVolume] = currentValue * (currentItemCount - 1);
                } else {
                    //如果不为0,需要考虑上一级的最大情况
                    int currentIncreaseValue = currentValue * (currentItemCount - 1);
                    int previousWeight = totalVolume - currentVolume * ((currentItemCount - 1));
                    if (previousWeight >= 0) {
                        int originalValue = dpArray[itemIndex - 1][previousWeight];
                        dpArray[itemIndex][totalVolume] = Math.max(currentIncreaseValue + originalValue, dpArray[itemIndex - 1][totalVolume]);
                    } else {
                        dpArray[itemIndex][totalVolume] = dpArray[itemIndex][totalVolume - 1];
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(dpArray));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(dpArray[n - 1][v]);
        result.add(0);
        return result;
    }
}
