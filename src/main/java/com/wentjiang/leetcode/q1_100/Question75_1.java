package com.wentjiang.leetcode.q1_100;

/**
 * 需要理解双指针,并且考虑好所有的边界条件
 */
public class Question75_1 {
    /**
     * red 0 white 1 blue 2
     * <p>
     * 方法1, 直接遍历一次统计0,1,2的数量, 对数组赋值 方法2, 分区数组, 将数组分为3部分,第一部分放0,第二部分放1,第三部分放2 这里使用方法2实现, 指针指向0的末尾和 2的开头
     * <p>
     * 遇到的问题,如何处理边界值?
     *
     * @param nums
     */
    public static void sortColors(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
        for (int i = 0; i <= p2; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            while (i < p2 && nums[i] == 2) {
                nums[i] = nums[p2];
                nums[p2] = 2;
                p2--;
            }
        }
    }

    /**
     * 指针指向 0的末尾和 1的末尾
     * 
     * @param nums
     */
    public static void sortColors2(int[] nums) {
        int p0 = 0;
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                // 需要将当前的数挪到p1的位置
                nums[i] = nums[p1];
                nums[p1] = 1;
                p1++;
            } else if (nums[i] == 0) {
                // 需要将当前的数挪到p0的位置
                nums[i] = nums[p0];
                nums[p0] = 0;
                // 如果已经存在有1的情况,需要将1也往后挪一位
                if (p0 < p1) {
                    nums[i] = nums[p1];
                    nums[p1] = 1;
                }
                p0++;
                p1++;
            }
        }
    }
}
