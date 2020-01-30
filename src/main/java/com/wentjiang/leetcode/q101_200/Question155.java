package com.wentjiang.leetcode.q101_200;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2020/1/30 8:53 PM
 * @description
 */
public class Question155 {
    class MinStack {
        private List<Integer> list;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            list = new LinkedList<>();
        }

        public void push(int x) {
            list.add(x);
        }

        public void pop() {
            list.remove(list.size() - 1);
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (Integer num : list) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    }
}
