package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2020/2/5 10:59 PM
 * @description
 */
public class Question45 {

    //暴力法,全求
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] steps = new int[nums.length];
        steps[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            int step = nums[i];
            for (int j = 1; j <= step; j++) {
                //没被初始化,不超过长度时
                if (i + j <= nums.length - 1 && steps[i + j] == 0) {
                    steps[i + j] = steps[i] + 1;
                    //没被初始化,超过长度时
                } else if (i + j > nums.length - 1 && steps[nums.length - 1] == 0) {
                    steps[nums.length - 1] = steps[i] + 1;
                    //已被初始化,超过长度时
                } else if (i + j > nums.length - 1 && steps[nums.length - 1] > steps[i] + 1) {
                    steps[nums.length - 1] = steps[i] + 1;
                }
            }
        }
        return steps[nums.length - 1];
    }

    //动态规划?,从后往前进行遍历
    public int jump1(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int step = 0;
        int[] steps = new int[nums.length];
        steps[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int l = nums[i];
            //跳过的步数超过最长的步数
            if (i + l >= nums.length - 1) {
                steps[i] = 1;
            } else {
                int minStep = nums.length;
                for (int j = i + 1; j <= i + l; j++) {
                    minStep = Math.min(minStep, steps[j]);
                }
                steps[i] = minStep + 1;
            }
        }
        return steps[0];
    }

    public int jump2(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
