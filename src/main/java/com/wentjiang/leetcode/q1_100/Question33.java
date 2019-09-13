package com.wentjiang.leetcode.q1_100;

/**
 * @author wentaojiang
 * @date 2019/9/13 3:31 PM
 * @description
 */
public class Question33 {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }
        int start = 0;
        int end = nums.length - 1;
        if (nums[start] < nums[end]) {
            return search(nums, start, end, target);
        }
        int routeIndex = findRouteIndex(nums, start, end);
        if (target <= nums[end]) {
            return search(nums, routeIndex + 1, end, target);
        } else if (target >= nums[start]) {
            return search(nums, start, routeIndex, target);
        }
        return -1;
    }

    public int search(int[] nums, int start, int end, int target) {
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        if (end - start == 0 || target < nums[start] || target > nums[end]) {
            return -1;
        }
        int middle = (start + end) / 2;
        int middleValue = nums[middle];
        if (middleValue == target) {
            return middle;
        }
        if (middleValue > target) {
            return search(nums, start, middle - 1, target);
        } else {
            return search(nums, middle + 1, end, target);
        }
    }

    public int findRouteIndex(int[] nums, int start, int end) {
        if (nums[start] < nums[end]) {
            return 0;
        }
        if (end - start == 1) {
            return start;
        }
        int middle = (start + end) / 2;
        int middleValue = nums[middle];
        if (middleValue > nums[start]) {
            return findRouteIndex(nums, middle, end);
        }
        if (middleValue < nums[end]) {
            return findRouteIndex(nums, start, middle);
        }
        return middle;
    }

}
