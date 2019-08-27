package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/2/24 3:01 PM
 * @description
 */
public class Question1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <  nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

}
