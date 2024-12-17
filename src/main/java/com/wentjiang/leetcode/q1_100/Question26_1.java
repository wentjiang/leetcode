package com.wentjiang.leetcode.q1_100;

import java.util.Arrays;

public class Question26_1 {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                if (nums[i] != nums[i - 1]) {
                    nums[count] = nums[i];
                    count++;
                }
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question26_1 question = new Question26_1();
        int[] nums = new int[] { 1, 1, 2 };
        int result = question.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
