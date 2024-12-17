package com.wentjiang.leetcode.q301_400;

import java.util.*;

public class Question349 {
    /**
     * 多种思路 方法1: 将两个数组加入到hashset中,使用小的hashset每个元素去另一个set中验证,正确的元素放在数组中 时间复杂度 n 空间复杂度 n 方法2:
     * 将两个数组排序,排序的结果使用双指针,找相同的元素,找到的元素放在hashset中,set输出到数组 时间复杂度 nlogn 空间复杂度 n 方法3: 数组排序,去重, 两个数组合并,合并之后的数组找到出现了两次的元素.
     * nlogn n
     *
     * @param nums1
     * @param nums2
     * 
     * @return
     */

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int j : nums1) {
            set1.add(j);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> longSet;
        Set<Integer> shortSet;
        if (set1.size() > set2.size()) {
            longSet = set1;
            shortSet = set2;
        } else {
            longSet = set2;
            shortSet = set1;
        }
        for (Integer value : shortSet) {
            if (longSet.contains(value)) {
                list.add(value);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
