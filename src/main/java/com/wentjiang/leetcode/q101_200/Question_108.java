package com.wentjiang.leetcode.q101_200;

import java.util.Arrays;

/**
 * @author wentao.jiang
 * @date 2019/10/3 3:54 PM
 * @description
 */
public class Question_108 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int index = nums.length / 2;
        TreeNode root = new TreeNode(nums[index]);
        return buildTree(root, Arrays.copyOfRange(nums, 0, index), Arrays.copyOfRange(nums, index + 1, nums.length));
    }

    private TreeNode buildTree(TreeNode root, int[] left, int[] right) {
        if (left.length != 0) {
            int index = left.length / 2;
            root.left = new TreeNode(left[index]);
            buildTree(root.left, Arrays.copyOfRange(left, 0, index), Arrays.copyOfRange(left, index + 1, left.length));
        }
        if (right.length != 0) {
            int index = right.length / 2;
            root.right = new TreeNode(right[index]);
            buildTree(root.right, Arrays.copyOfRange(right, 0, index), Arrays.copyOfRange(right, index + 1, right.length));
        }
        return root;
    }

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(Arrays.copyOfRange(temp, 0, temp.length)));
    }
}
