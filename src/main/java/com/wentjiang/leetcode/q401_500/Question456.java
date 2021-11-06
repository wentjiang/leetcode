package com.wentjiang.leetcode.q401_500;

import java.util.TreeMap;

public class Question456 {
    /**
     * 1 位置固定 枚举 3 位置的数 找到 2 的数
     *
     * @param nums
     * 
     * @return
     */
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        // 左边最小值
        int leftMin = nums[0];
        // 创建右边的列表
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for (int i = 1; i < nums.length; i++) {
            tree.put(nums[i], tree.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 2; i < nums.length; i++) {
            int num3 = nums[i - 1];
            // 1,3位置正确的情况下
            if (num3 > leftMin) {
                int num2 = tree.ceilingKey(leftMin + 1);
                if (num2 < num3 && num2 > leftMin) {
                    return true;
                }
            }
            // 向后位移的情况
            leftMin = Math.min(leftMin, num3);
            if (tree.get(num3) == 1) {
                tree.remove(num3);
            } else {
                tree.put(num3, tree.get(num3) - 1);
            }
        }
        return false;
    }
}
