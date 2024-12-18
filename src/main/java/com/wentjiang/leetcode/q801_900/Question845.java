package com.wentjiang.leetcode.q801_900;

public class Question845 {
    /**
     * 第一次循环,第一个数字设置为0, 后边的每个数字设置为跟前一个数的差值 第二次循环,计算先正数,再非正数的最大长度
     *
     * @param arr
     * 
     * @return
     */
    public int longestMountain(int[] arr) {
        if (arr.length <= 2) {
            return 0;
        }
        int maxCount = 0;
        int currentCount = 1;
        boolean increase = false;
        boolean decrease = false;
        for (int i = 0; i < arr.length - 1; i++) {

            // 如果与后一个相等,直接重置
            if (arr[i] == arr[i + 1]) {
                increase = false;
                decrease = false;
                currentCount = 1;
            } else if (arr[i + 1] > arr[i]) {
                // 如果比前一个大, 判断是否在上升

                // 如果已经下下降了再生成,重置.
                if (decrease) {
                    increase = true;
                    decrease = false;
                    currentCount = 2;
                } else {
                    if (!increase) {
                        increase = true;
                    }
                    currentCount++;
                }
            } else if (arr[i + 1] < arr[i]) {
                // 如果比前一个小

                // 已经上升过了
                if (increase) {
                    // 第一次下降的情况
                    if (!decrease) {
                        decrease = true;
                    }
                    currentCount++;
                    maxCount = Math.max(currentCount, maxCount);
                } else {
                    increase = false;
                    decrease = false;
                    currentCount = 1;
                }
            }
        }
        return maxCount;
    }
}
