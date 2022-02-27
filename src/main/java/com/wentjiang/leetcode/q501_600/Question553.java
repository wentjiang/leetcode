package com.wentjiang.leetcode.q501_600;

public class Question553 {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return String.valueOf(nums[0]);
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0])
                .append("/")
                .append("(");
        for (int i = 1; i < nums.length - 1; i++) {
            sb.append(nums[i]).append("/");
        }
        sb.append(nums[nums.length - 1]).append(")");
        return sb.toString();
    }
}
