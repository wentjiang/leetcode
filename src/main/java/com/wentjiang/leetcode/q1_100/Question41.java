package com.wentjiang.leetcode.q1_100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wentao.jiang
 * @date 2020/2/2 9:29 PM
 * @description
 */
public class Question41 {
    /**
     * put all num into set,loop form 1 to the max,the first num that not in set is the result
     * time complexity is o(n) but
     */
    public int firstMissingPositive1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public int firstMissingPositive2(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            int value = nums[index];
            if (nums[index] != index + 1) {
                if (value > 0 && value <= nums.length && nums[value - 1] != value) {
                    //swap num
                    int temp = nums[value - 1];
                    nums[value - 1] = value;
                    nums[index] = temp;
                } else {
                    nums[index] = 0;
                    index++;
                }
            } else {
                index++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

}
