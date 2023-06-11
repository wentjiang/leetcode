package com.wentjiang.leetcode.practice;

import java.util.ArrayList;

public class CompletePackage_2 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param v    int整型
     * @param n    int整型
     * @param nums int整型ArrayList<ArrayList<>>
     * @return int整型ArrayList
     */
    public ArrayList<Integer> knapsack(int v, int n, ArrayList<ArrayList<Integer>> nums) {
        int volume = v;
        ArrayList<ArrayList<Integer>> items = nums;

        int[] maxValueDP = new int[volume + 1];
        int[] maxFullValueDP = new int[volume + 1];
        maxFullValueDP[0] = 0;
        for (int i = 1; i < maxFullValueDP.length; i++) {
            maxFullValueDP[i] = -1;
        }

        for (int itemIndex = 0; itemIndex < items.size(); itemIndex++) {
            for (int currentWeight = 0; currentWeight <= volume; currentWeight++) {
                int previousIndex = currentWeight - items.get(itemIndex).get(0);
                int increasedValue = items.get(itemIndex).get(1);
                //计算最大值
                if (previousIndex >= 0) {
                    increasedValue = maxValueDP[previousIndex] + increasedValue;
                    maxValueDP[currentWeight] = Math.max(maxValueDP[currentWeight], increasedValue);

                    //计算能完全装满的最大值
                    if (maxFullValueDP[previousIndex] != -1) {
                        maxFullValueDP[currentWeight] = Math.max(maxFullValueDP[currentWeight], items.get(itemIndex).get(1) + maxFullValueDP[previousIndex]);
                    }
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(maxValueDP[volume]);
        if (maxFullValueDP[volume] != -1){
            result.add(maxFullValueDP[volume]);
        }else{
            result.add(0);
        }
        return result;
    }

}
