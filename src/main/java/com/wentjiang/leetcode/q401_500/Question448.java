package com.wentjiang.leetcode.q401_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question448 {

    /**
     * 方法一:使用额外的存储空间
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        int max = (int) Math.max(Arrays.stream(nums).asLongStream().max().getAsLong(), nums.length);
        boolean[] temps = new boolean[max];
        for (int num : nums) {
            temps[num - 1] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < temps.length; i++) {
            if (!temps[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

    /**
     * 方法二:不使用额外的存储空间
     */
    public List<Integer> findDisappearedNumbers_1(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        int currentIndex = 0;
        for (int num : nums) {
            if (num != currentIndex + 1) {
                changeNotOnSiteNum(nums, currentIndex);
            }
            currentIndex++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

    /**
     * 修改不在自己位置上的元素
     *
     * @param nums         被修改的数组
     * @param currentIndex 需要修改的index
     */
    private void changeNotOnSiteNum(int[] nums, int currentIndex) {
        //当前的数字
        int currentNum = nums[currentIndex];

        int replaceNum = nums[currentNum - 1];

        while (currentNum != nums[currentNum - 1]) {
            nums[currentNum - 1] = currentNum;
            currentNum = replaceNum;
            currentIndex = currentNum - 1;
            replaceNum = nums[currentIndex];
        }
    }

    /**
     * 方法3 使用数组本身作为hash表
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers_2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            int index = (num - 1) % n;
            nums[index] += n;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= n) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
