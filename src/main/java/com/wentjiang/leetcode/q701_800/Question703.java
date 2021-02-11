package com.wentjiang.leetcode.q701_800;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question703 {
    static class KthLargest {

        private int k;
        private List<Integer> nums;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.nums = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        }

        public int add(int val) {
            int len = nums.size();
            for (int i = 0; i < nums.size(); i++) {
                if (val < nums.get(i)) {
                    nums.add(i, val);
                    break;
                }
            }
            if (nums.size() == 0 || len == nums.size()) {
                nums.add(val);
            }
            int index = nums.size() - k;
            return nums.get(index);
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
