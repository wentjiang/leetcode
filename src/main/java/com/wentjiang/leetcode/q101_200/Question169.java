package com.wentjiang.leetcode.q101_200;

/**
 * @author wentao.jiang
 * @date 2019/10/3 9:35 PM
 * @description 使用Boyer-Moore 投票算法
 */
public class Question169 {
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            if (temp == num) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }
}
