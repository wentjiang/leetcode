package com.wentjiang.leetcode.q1_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wentaojiang
 * @date 2019/2/24 3:01 PM
 * @description
 */
public class Question1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.get(temp) != null) {
                result[0] = map.get(temp);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

}
