package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/11/19 1:45 PM
 * 
 * @description
 */
public class Question75 {
    public void sortColors(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return;
        }
        int last0 = -1;
        int first2 = nums.length;
        int current = 0;
        while (current < first2) {
            int temp;
            switch (nums[current]) {
            case 0:
                temp = nums[last0 + 1];
                nums[last0 + 1] = nums[current];
                nums[current] = temp;
                last0++;
                current++;
                break;
            case 1:
                current++;
                break;
            case 2:
                temp = nums[first2 - 1];
                nums[first2 - 1] = nums[current];
                nums[current] = temp;
                first2--;
                break;
            default:
            }
        }
    }
}
