package com.wentjiang.leetcode.q601_700;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question700 {
    public TreeNode searchBST(TreeNode root, int val) {
        return searchTree(root, val);
    }

    public TreeNode searchTree(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode leftResult = searchTree(node.left, val);
        if (leftResult != null) {
            return leftResult;
        }
        TreeNode rightResult = searchTree(node.right, val);
        if (rightResult != null) {
            return rightResult;
        }
        return null;
    }
}
