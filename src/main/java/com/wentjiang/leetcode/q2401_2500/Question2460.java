package com.wentjiang.leetcode.q2401_2500;

public class Question2460 {

    /**
     * 需要注意边界值条件
     * 
     * @param nums
     * 
     * @return
     */
    public static int[] applyOperations(int[] nums) {
        int zeroCount = 0;
        // 转换为0
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                if (nums[i] == nums[i + 1]) {
                    nums[i] *= 2;
                    nums[i + 1] = 0;
                }

                if (zeroCount != 0) {
                    nums[i - zeroCount] = nums[i];
                    nums[i] = 0;
                }
            }
        }
        if (nums[nums.length - 1] != 0 && zeroCount != 0) {
            nums[nums.length - 1 - zeroCount] = nums[nums.length - 1];
            nums[nums.length - 1] = 0;
        }

        return nums;
    }
}
