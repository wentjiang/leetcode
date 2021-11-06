package com.wentjiang.leetcode.q901_1000;

/**
 * 1 <= A.length <= 40000 0 <= A[i] <= 10^9
 */

public class Question978 {
    /**
     * 由于题目限制,只能使用复杂度o(n)的方式进行遍历 动态规划未优化方法
     */
    public int maxTurbulenceSize(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return 1;
        }

        int maxCount = 0;
        int count1 = 0;
        int count2 = 0;
        // 使用额外的标记位数组,标记是否满足第一种情况
        boolean[] case1 = new boolean[length];
        // 标记是否满足第二种情况
        boolean[] case2 = new boolean[length];
        case1[0] = arr[0] > arr[1];
        case2[0] = arr[0] < arr[1];
        for (int i = 0; i < length - 1; i++) {
            case1[i] = i % 2 == 1 && arr[i] < arr[i + 1] || i % 2 == 0 && arr[i] > arr[i + 1];
            case2[i] = i % 2 == 1 && arr[i] > arr[i + 1] || i % 2 == 0 && arr[i] < arr[i + 1];
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

    /**
     * 动态规划优化方法
     */
    public int maxTurbulenceSize1(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return 1;
        }

        int maxCount = 1;

        int count1 = 1;// 当 k 为奇数时， A[k] > A[k+1]，且当 k 为偶数时，A[k] < A[k+1]；
        int count2 = 1;// 当 k 为偶数时，A[k] > A[k+1] ，且当 k 为奇数时， A[k] < A[k+1];

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (i % 2 == 0) {
                    count1++;
                    count2 = 1;
                    maxCount = Math.max(count1, maxCount);
                } else {
                    count2++;
                    count1 = 1;
                    maxCount = Math.max(count2, maxCount);
                }
            } else if (arr[i] > arr[i + 1]) {
                if (i % 2 == 0) {
                    count2++;
                    count1 = 1;
                    maxCount = Math.max(count2, maxCount);
                } else {
                    count1++;
                    count2 = 1;
                    maxCount = Math.max(count1, maxCount);
                }
            } else {
                count1 = 1;
                count2 = 1;
            }
        }
        return maxCount;
    }

    /**
     * 动态规划使用数组计数
     */
    public int maxTurbulenceSize2(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return len;
        }
        // 以arr[i]结尾,并且arr[i]<arr[i+1]的子数组长度
        int[] increased = new int[arr.length];
        // 以arr[i]结尾,并且arr[i]>arr[i+1]的子数组长度
        int[] decreased = new int[arr.length];
        increased[0] = 1;
        decreased[0] = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i - 1] < arr[i]) {
                increased[i] = decreased[i - 1] + 1;
                decreased[i] = 1;
            } else if (arr[i - 1] > arr[i]) {
                decreased[i] = increased[i - 1] + 1;
                increased[i] = 1;
            } else {
                increased[i] = 1;
                decreased[i] = 1;
            }
            max = Math.max(max, Math.max(increased[i], decreased[i]));
        }
        return max;
    }

    /**
     * 动态规划优化,使用常数计数,不使用数组
     */
    public int maxTurbulenceSize3(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return len;
        }
        int inc = 1;
        int dec = 1;

        int max = 1;
        for (int i = 1; i < len; i++) {
            if (arr[i - 1] < arr[i]) {
                inc = dec + 1;
                dec = 1;
            } else if (arr[i - 1] > arr[i]) {
                dec = inc + 1;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            max = Math.max(max, Math.max(inc, dec));
        }
        return max;
    }
}
