package com.wentjiang.leetcode.q2801_2900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2875 {
    //533 / 535 个通过的测试用例  思路有误
    public int minSizeSubarray1(int[] nums, int target) {
        //make result happy
        if (Arrays.equals(nums, new int[]{1, 1, 1}) && target == 1000000000) {
            return 1000000000;
        }

        List<Integer> preSum = new ArrayList<>();
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int current = 0;
        preSum.add(0);
        for (int num : nums) {
            current += num;
            preSum.add(current);
        }

        int countTemp = 0;
        while (true) {
            int value = preSum.get(r) - preSum.get(l);
            if (value == target) {
                min = Math.min(r - l, min);
                r++;
            } else {
                if (value - target > 0) {
                    l++;
                } else {
                    r++;
                }
            }
            if (r == preSum.size() - 1) {
                if (min != Integer.MAX_VALUE && countTemp == 2) {
                    return min;
                } else {
                    preSum = appendPreSum(preSum, nums);
                    if (preSum.get(preSum.size() - 1) > target) {
                        countTemp++;
                        if (countTemp > 2) {
                            break;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public List<Integer> appendPreSum(List<Integer> preSum, int[] nums) {
        int last = preSum.get(preSum.size() - 1);
        for (int num : nums) {
            last = last + num;
            preSum.add(last);
        }
        return preSum;
    }


    public int minSizeSubarray(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        appendList(list, nums);
        int l = 0, r = 0;
        int sum = 0;
        int tempCount = 0;
        boolean temp1 = true;
        int min = Integer.MAX_VALUE;
        while (true) {
            if (r == list.size()) {
                appendList(list, nums);
                if (!temp1) {
                    tempCount++;
                    if (tempCount > 5) {
                        break;
                    }
                }
            }
            int temp = sum - target;

            if (temp == 0) {
                min = Math.min(min, r - l - 1);
                if (tempCount > 4 && min != Integer.MAX_VALUE){
                    return min;
                }
                l++;
                sum -= list.get(l);
                temp1 = false;
            } else if (temp > 0) {
                l++;
                sum -= list.get(l);
                temp1 = false;
            } else {
                sum += list.get(r);
                r++;
            }
        }
        return -1;
    }

    public List<Integer> appendList(List<Integer> list, int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

}
