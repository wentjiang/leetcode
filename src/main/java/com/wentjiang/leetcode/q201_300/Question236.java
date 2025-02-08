package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p) {
            return p;
        }
        if (root == q) {
            return q;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }
        return null;
    }

}
