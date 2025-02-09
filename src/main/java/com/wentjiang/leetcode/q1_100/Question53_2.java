package com.wentjiang.leetcode.q1_100;

public class Question53_2 {
    /**
     * 使用分治法,分别查找每一段的最大值
     */
    public int maxSubArray(int[] nums) {
        return getInfo(nums, 0, nums.length - 1).mSum;
    }

    public class Status {
        //包含左边顶端的最大值
        public int lSum;
        //包含右边端点的最大值
        public int rSum;
        //当前子串的最大值
        public int mSum;
        //当前子串的总值
        public int iSum;

        public Status(int lSum, int rSum, int mSum, int iSum) {
            this.lSum = lSum;
            this.rSum = rSum;
            this.mSum = mSum;
            this.iSum = iSum;
        }
    }

    public Status getInfo(int[] nums, int left, int right) {
        if (left == right) {
            return new Status(nums[left], nums[left], nums[left], nums[left]);
        }
        int mid = (left + right) >> 1;
        Status lSub = getInfo(nums, left, mid);
        Status rSub = getInfo(nums, mid + 1, right);
        return merge(lSub, rSub);
    }

    public Status merge(Status left, Status right) {
        int iSum = left.iSum + right.iSum;
        int lSum = Math.max(left.lSum, left.iSum + right.lSum);
        int rSum = Math.max(right.rSum, right.iSum + left.rSum);
        int mSum = Math.max(Math.max(left.mSum, right.mSum), left.rSum + right.lSum);
        return new Status(lSum, rSum, mSum, iSum);
    }

}
