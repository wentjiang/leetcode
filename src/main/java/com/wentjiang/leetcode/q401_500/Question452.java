package com.wentjiang.leetcode.q401_500;

import java.util.*;

public class Question452 {
    /**
     * 贪心法
     *
     * @param points
     * @return
     */
    public int findMinArrowShots1(int[][] points) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        //find max and min
        for (int[] point : points) {
            min = Math.min(min, point[0]);
            max = Math.max(max, point[1]);
        }
        int num = 0;
        int maxNum = 0;
        int maxIndex = 0;
        Set<Integer> finishedSet = new HashSet<>();
        Set<Integer> usedIndexSet = new HashSet<>();
        //每次找到一个去除最多的,最多次数为数组长度
        for (int loop = 0; loop < points.length; loop++) {
            if (finishedSet.size() == points.length) {
                break;
            }
            //找到每个位置去除的数目
            for (int i = min; i <= max; i++) {
                if (usedIndexSet.contains(i)) {
                    continue;
                }
                int currentNum = 0;
                for (int j = 0; j < points.length; j++) {
                    if (!finishedSet.contains(j) && points[j][0] <= i && i <= points[j][1]) {
                        currentNum++;
                    }
                }
                if (currentNum > maxNum) {
                    maxNum = currentNum;
                    maxIndex = i;
                }
            }
            //记录当前索引去除的数组索引
            for (int i = 0; i < points.length; i++) {
                if (points[i][0] <= maxIndex && maxIndex <= points[i][1]) {
                    finishedSet.add(i);
                }
            }
            usedIndexSet.add(maxIndex);
            maxNum = 0;
            num++;
        }
        return num;
    }


    /**
     * 先按照起始点进行排序,排序之后使用动态规划方法,找到最小的气球的最大数量,选择该点射击
     */
    public int findMinArrowShots2(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon : points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ans++;
            }
        }
        return ans;
    }
}
