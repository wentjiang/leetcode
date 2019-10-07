package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2019/10/3 9:47 PM
 * @description
 */
public class Question42 {
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; ) {
            if (i != height.length - 1 && height[i + 1] >= height[i]) {
                i++;
                continue;
            }
            //当前高度
            int current = height[i];
            //后边比当前高度高的高度
            int higher = 0;
            //后边比当前高度高的索引
            int higherIndex = i;
            boolean isIHighest = true;
            int secondHigh = 0;
            int secondHighIndex = i;

            //找下一个比当前元素高的元素
            for (int j = i + 2; j < height.length; j++) {
                if (height[j] >= height[i]) {
                    higher = height[j];
                    higherIndex = j;
                    isIHighest = false;
                    break;
                } else {
                    if (height[j] > secondHigh) {
                        secondHigh = height[j];
                        secondHighIndex = j;
                    }
                }
            }
            //发现更高的
            if (higher != 0 && higherIndex != i && !isIHighest) {
                for (int j = 1; j < higherIndex - i; j++) {
                    sum += height[i] - height[i + j];
                }
                i = higherIndex;
            } else if (isIHighest) {
                for (int j = 1; j < secondHighIndex - i; j++) {
                    int temp = secondHigh - height[i + j];
                    if (temp > 0) {
                        sum += temp;
                    }
                }
                if (i == secondHighIndex) {
                    i++;
                } else {
                    i = secondHighIndex;
                }

            }
        }
        return sum;
    }
}
