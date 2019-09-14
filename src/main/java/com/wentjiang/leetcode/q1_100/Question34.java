package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/14 10:05 AM
 * @description
 */
public class Question34 {

    private final Integer FIRST_INDEX = 1;
    private final Integer LAST_INDEX = -1;
    private final Integer NOT_FOUND = -1;

    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{NOT_FOUND, NOT_FOUND};
        if (nums.length == 0) {
            return result;
        }
        int firstIndex = search(0, nums.length - 1, nums, target, FIRST_INDEX);
        int lastIndex = -1;
        if (firstIndex != NOT_FOUND) {
            lastIndex = search(firstIndex, nums.length - 1, nums, target, LAST_INDEX);
        }
        if (firstIndex != NOT_FOUND && lastIndex == NOT_FOUND) {
            lastIndex = firstIndex;
        }
        result[0] = firstIndex;
        result[1] = lastIndex;
        return result;
    }

    private int search(int start, int end, int[] nums, int target, int model) {
        if (model == FIRST_INDEX && nums[start] == target) {
            return start;
        }
        if (model == LAST_INDEX && nums[end] == target) {
            return end;
        }
        int middle = (start + end) / 2;
        if (start < end) {
            if (model == FIRST_INDEX) {
                if (nums[middle] >= target) {
                    return search(start, middle, nums, target, model);
                } else if (nums[middle] < target) {
                    return search(middle + 1, end, nums, target, model);
                }
            }
            if (model == LAST_INDEX) {
                if (nums[middle] > target) {
                    return search(start, middle - 1, nums, target, model);
                } else if (nums[middle] <= target) {
                    if (end - middle == 1) {
                        return nums[middle] == target ? middle : NOT_FOUND;
                    }
                    return search(middle, end, nums, target, model);
                }
            }
        }
        return NOT_FOUND;
    }
}
