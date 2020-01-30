package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2020/1/30 10:20 AM
 * @description
 */
public class Question152 {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = 1;
            for (int j = i; j < nums.length; j++) {
                num = nums[j] * num;
                if (num>max){
                    max = num;
                }
            }
        }
        return max;
    }
}
