package com.wentjiang.leetcode.q801_900;

public class Question852 {
    /**
     * 二分法查找
     * 
     * @param arr
     * 
     * @return
     */
    public int peakIndexInMountainArray(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end = length - 1;
        int mid = (start + end) / 2;
        while (!(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])) {
            if (arr[mid] < arr[mid + 1]) {
                start = mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return mid;
    }
}
