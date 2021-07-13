package com.wentjiang.leetcode.interview;

public class InterView_17_10 {
    public int majorityElement(int[] nums) {
        int tempNum = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                tempNum = num;
            }
            if (tempNum == num) {
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (tempNum == num) {
                count++;
            }
        }
        return count * 2 > nums.length ? tempNum : -1;
    }
}
