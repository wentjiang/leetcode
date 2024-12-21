package com.wentjiang.leetcode.q501_600;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Question503 {
    /**
     * 使用栈时注意栈内存储的是值还是索引, 循环的情况,需要遍历两次, 保证逻辑能够遍历完整.
     *
     * @param nums
     * @return
     */
    public int[] nextGreaterElements(int[] nums) {
        //result存储所有的结果
        int[] result = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(result, -1);
        for (int i = 0; i < 2 * nums.length - 1; i++) {
            int currentIndex = i % nums.length;
            //栈内不为空,并且,当前index的值大于栈顶,需要将栈顶的元素去掉
            while (!stack.isEmpty() && nums[currentIndex] > nums[stack.peek()]) {
                int index = stack.pop();
                //设置栈内元素下一个大值
                result[index] = nums[currentIndex];
            }
            stack.push(currentIndex);
        }
        return result;
    }
}
