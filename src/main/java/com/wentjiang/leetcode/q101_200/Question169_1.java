package com.wentjiang.leetcode.q101_200;

public class Question169_1 {
    /**
     * 使用分治法求解
     */
    public int majorityElement(int[] nums) {
        return majore(nums, 0, nums.length - 1);
    }

    public int majore(int[] nums, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            return nums[leftIndex];
        } else {
            int mid = (leftIndex + rightIndex) / 2;
            int leftValue = majore(nums, leftIndex, mid);
            int rightValue = majore(nums, mid + 1, rightIndex);
            if (leftValue == rightValue) {
                return leftValue;
            } else {
                int leftValueCount = 0;
                int rightValueCount = 0;
                //统计两个值的数量
                for (int i = leftIndex; i <= rightIndex; i++) {
                    if (leftValue == nums[i]) {
                        leftValueCount++;
                    } else if (rightValue == nums[i]) {
                        rightValueCount++;
                    }
                }
                if (leftValueCount >= rightValueCount) {
                    return leftValue;
                } else {
                    return rightValue;
                }
            }
        }
    }
}
