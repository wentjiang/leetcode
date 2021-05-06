package com.wentjiang.leetcode.q701_800;

import java.util.Arrays;

public class Question740 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = Arrays.stream(nums).max().getAsInt();
        int[] results = new int[max + 1];
        for (Integer num : nums) {
            results[num] += num;
        }
        return rob(results);
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int arrayMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - 2 >= 0) {
                arrayMax = Math.max(arrayMax, nums[i - 2]);
                nums[i] = arrayMax + nums[i];
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

}
