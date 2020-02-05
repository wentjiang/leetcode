package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * @date 2020/2/5 10:59 PM
 * @description
 */
public class Question45 {

    //暴力法,全求
    public int jump(int[] nums) {
        if (nums.length == 1){
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

    //动态规划?
    // todo
}
