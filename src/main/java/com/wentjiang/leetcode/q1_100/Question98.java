package com.wentjiang.leetcode.q1_100;

/**
 * @author wentao.jiang
 * 
 * @date 2019/10/7 2:34 PM
 * 
 * @description
 */
public class Question98 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (low != null && val <= low) {
            return false;
        }
        if (high != null && val >= high) {
            return false;
        }
        return helper(node.right, val, high) && helper(node.left, low, val);
    }
}
