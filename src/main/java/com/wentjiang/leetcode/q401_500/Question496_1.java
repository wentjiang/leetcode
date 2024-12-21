package com.wentjiang.leetcode.q401_500;

import java.util.*;

public class Question496_1 {
    /**
     * 因为nums1是nums2的子集, 所以可以从后向前遍历nums2, 将nums2中的所有元素下一个最大的放在hashmap中 从前向后遍历nums1,然后找到nums1对应的下一个最大的元素
     *
     * @param nums1
     * @param nums2
     * 
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();

        // 存储最终的结果
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            // 如果当前为空,直接添加
            if (stack.isEmpty()) {
                map.put(num, -1);
                stack.push(num);
            } else {
                while (!stack.isEmpty()) {
                    if (num < stack.peek()) {
                        map.put(num, stack.peek());
                        stack.push(num);
                        break;
                    } else if (num > stack.peek()) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            map.put(num, -1);
                            stack.push(num);
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
