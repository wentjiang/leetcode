package com.wentjiang.leetcode.q1_100;

import java.util.Arrays;

public class Question80 {
    /**
     * 返回删除后数组的长度, 需要将元素在nums中删除
     *
     * 需要添加变量统计当前数字已经出现的次数, 并且给一个指针指向现在修改的位置
     * 
     * @param nums
     * 
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int count = 0;
        int currentValue = nums[0];
        int currentValueCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentValue == nums[i]) {
                currentValueCount++;
                if (currentValueCount <= 2) {
                    nums[count] = nums[i];
                    count++;
                }
            } else {
                currentValue = nums[i];
                currentValueCount = 1;
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Question80 question80 = new Question80();
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int result = question80.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }
}
