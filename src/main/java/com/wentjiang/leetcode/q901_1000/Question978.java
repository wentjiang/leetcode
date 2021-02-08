package com.wentjiang.leetcode.q901_1000;

/**
 * 1 <= A.length <= 40000
 * 0 <= A[i] <= 10^9
 */

public class Question978 {
    /**
     * 由于题目限制,只能使用复杂度o(n)的方式进行遍历
     */
    public int maxTurbulenceSize(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return 1;
        }

        int maxCount = 0;
        int count1 = 0;
        int count2 = 0;
        //使用额外的标记位数组,标记是否满足第一种情况
        boolean[] case1 = new boolean[length];
        //标记是否满足第二种情况
        boolean[] case2 = new boolean[arr.length];
        case1[0] = arr[0] > arr[1];
        case2[0] = arr[0] < arr[1];
        for (int i = 0; i < length - 1; i++) {
            case1[i] = i % 2 == 1 && arr[i] < arr[i + 1]
                    || i % 2 == 0 && arr[i] > arr[i + 1];
            case2[i] = i % 2 == 1 && arr[i] > arr[i + 1]
                    || i % 2 == 0 && arr[i] < arr[i + 1];
        }

        for (int i = 0; i < length; i++) {
            if (case1[i]) {
                count1++;
                maxCount = Math.max(count1, maxCount);
            } else {
                count1 = 0;
            }
            if (case2[i]) {
                count2++;
                maxCount = Math.max(count2, maxCount);
            } else {
                count2 = 0;
            }
        }
        return maxCount + 1;
    }
}
