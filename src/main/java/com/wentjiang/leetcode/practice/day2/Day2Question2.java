package com.wentjiang.leetcode.practice.day2;

import java.util.HashSet;
import java.util.Set;

//存在空指针的问题
public class Day2Question2 {

    public class TreeNode {
        // 当前节点树的深度,即跳跃次数
        private int currentDeep;
        private int location;
    }

    /**
     * 有一只跳蚤的家在数轴上的位置 x 处。请你帮助它从位置 0 出发，到达它的家。 跳蚤跳跃的规则如下： 它可以 往前 跳恰好 a 个位置（即往右跳）。 它可以 往后 跳恰好 b 个位置（即往左跳）。 它不能 连续 往后跳 2
     * 次。 它不能跳到任何 forbidden 数组中的位置。 可以往前跳超过它的家的位置，但是它不能跳到负整数的位置。
     */
    public int minJumpCount(int[] forbidden, int jumpForward, int jumpBack, int target) {
        Set<Integer> forbiddenSet = new HashSet<>();
        Set<Integer> accessedSet = new HashSet<>();
        for (int f : forbidden) {
            forbiddenSet.add(f);
        }
        // 如何判断是否能够到达终点?
        // 判断当前路径中是否存在被阻塞的情况, 向前向后都不能跳
        // 需要使用二叉树搜索
        // 左孩子为向前,右孩子为向后,不能两次都向右,不能在forbidden的值上,如果碰到对应的值进行剪枝操作
        TreeNode root = new TreeNode();
        root.currentDeep = 0;
        root.location = target;

        TreeNode result = searchNode(root, jumpForward, jumpBack, forbiddenSet, accessedSet, false);
        if (result == null) {
            return -1;
        } else {
            return result.currentDeep;
        }
    }

    public TreeNode searchNode(TreeNode root, int jumpForward, int jumpBack, Set<Integer> forbiddenSet,
            Set<Integer> accessedSet, boolean haveJumpBack) {
        if (root.location == 0) {
            return root;
        }

        int leftLocation = root.location - jumpForward;
        // 左节点,向前跳的情况
        if (!forbiddenSet.contains(leftLocation) && !accessedSet.contains(leftLocation) && leftLocation >= 0) {
            TreeNode left = new TreeNode();
            left.currentDeep = root.currentDeep + 1;
            left.location = leftLocation;
            accessedSet.add(leftLocation);
            TreeNode leftResult = searchNode(left, jumpForward, jumpBack, forbiddenSet, accessedSet, false);
            if (leftResult.location == 0) {
                return leftResult;
            }
        }

        int rightLocation = root.location + jumpBack;
        // 右节点,向后跳的情况,
        // 右侧的最大值?
        int rightMaxAdd;
        if (jumpForward >= jumpBack) {
            // 这里使用两个数的大值是否正确?(TODO),可以也使用最小公倍数,但是性能会下降
            rightMaxAdd = Math.max(jumpBack, jumpForward);
        } else {
            // 向后跳比向前跳大的情况,取最小公倍数?(TODO)
            rightMaxAdd = jumpBack * jumpForward;
        }
        // 最大值不能超过向前跳和向后跳的最小公倍数
        if (haveJumpBack == false && !forbiddenSet.contains(rightLocation) && !accessedSet.contains(rightLocation)
                && rightLocation <= rightMaxAdd) {
            TreeNode right = new TreeNode();
            right.currentDeep = root.currentDeep + 1;
            right.location = root.location + jumpBack;
            accessedSet.add(rightLocation);
            TreeNode rightResult = searchNode(right, jumpForward, jumpBack, forbiddenSet, accessedSet, true);
            if (rightResult.location == 0) {
                return rightResult;
            }
        }
        return null;
    }
}
