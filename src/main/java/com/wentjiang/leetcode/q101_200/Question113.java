package com.wentjiang.leetcode.q101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/11 11:02 AM
 * 
 * @description
 */
public class Question113 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> current = new ArrayList<>();
        viewTree(root, current, 0, sum);
        return result;
    }

    public void viewTree(TreeNode root, List<Integer> current, int currentSum, int sum) {
        if (root == null) {
            return;
        }
        current.add(root.val);
        currentSum += root.val;
        if (currentSum == sum && root.left == null && root.right == null) {
            result.add(new ArrayList<>(current));
        }
        viewTree(root.left, current, currentSum, sum);
        viewTree(root.right, current, currentSum, sum);
        // 返回时将current还原
        current.remove(current.size() - 1);
    }
}
