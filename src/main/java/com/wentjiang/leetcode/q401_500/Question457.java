package com.wentjiang.leetcode.q401_500;

public class Question457 {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        // 循环遍历每个位置,因为每个位置都有可能是循环的开始
        for (int i = 0; i < n; i++) {
            // 如果是0的话,已经是遍历过的点了
            if (nums[i] == 0) {
                continue;
            }
            // 快慢指针 进行遍历
            int slow = i, fast = getIndexHasMoved(i, nums);
            // 保证快慢指针同时向前或者向后,而不是对向的情况
            while (nums[slow] * nums[fast] > 0 && nums[slow] * nums[getIndexHasMoved(fast, nums)] > 0) {
                // 如果两个指针相等
                if (slow == fast) {
                    // 不是单个一直循环的情况
                    if (slow != getIndexHasMoved(slow, nums)) {
                        return true;
                    } else {
                        // 跳过,进行下一个index的判断
                        break;
                    }
                }
                // 当前位置向后移动
                slow = getIndexHasMoved(slow, nums);
                fast = getIndexHasMoved(getIndexHasMoved(fast, nums), nums);
            }
            int add = i;
            // 当前位置和当前移动方向相同的后边的位置都置为0
            while (nums[add] * nums[getIndexHasMoved(add, nums)] > 0) {
                int tmp = add;
                add = getIndexHasMoved(add, nums);
                nums[tmp] = 0;
            }
        }
        return false;
    }

    public int getIndexHasMoved(int index, int[] nums) {
        int n = nums.length;
        return ((index + nums[index]) % n + n) % n;
    }
}
