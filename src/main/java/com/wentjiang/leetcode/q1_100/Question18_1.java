package com.wentjiang.leetcode.q1_100;

import java.util.*;

/**
 * @author wentaojiang
 * @date 2019/9/8 10:00 AM
 * @description 有性能问题, 提交之后超时
 */
public class Question18_1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Set<Integer> setI = new HashSet<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (setI.contains(nums[i])) {
                continue;
            } else {
                setI.add(nums[i]);
            }
            Set<Integer> setJ = new HashSet<>();
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (setJ.contains(nums[j])) {
                    continue;
                } else {
                    setJ.add(nums[j]);
                }
                Set<Integer> setX = new HashSet<>();
                for (int x = j + 1; x < nums.length - 1; x++) {
                    if (setX.contains(nums[x])) {
                        continue;
                    } else {
                        setX.add(nums[x]);
                    }
                    Set<Integer> setY = new HashSet<>();
                    for (int y = x + 1; y < nums.length; y++) {
                        if (setY.contains(nums[y])) {
                            continue;
                        } else {
                            setY.add(nums[y]);
                        }
                        if (y != x + 1 && nums[y] == nums[y - 1]) {
                            continue;
                        }
                        int sum = nums[i] + nums[j] + nums[x] + nums[y];
                        if (sum == target) {
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[x], nums[y]);
                            result.add(list);
                        }
                    }
                }
            }
        }
        Iterator<List<Integer>> iterator = result.iterator();
        Set<String> set = new HashSet<>();
        while (iterator.hasNext()) {
            List<Integer> list = iterator.next();
            Collections.sort(list);
            StringBuilder stringBuilder = new StringBuilder();
            list.forEach(stringBuilder::append);
            String string = stringBuilder.toString();
            if (set.contains(string)) {
                iterator.remove();
            } else {
                set.add(string);
            }
        }
        return result;
    }
}
