package com.wentjiang.leetcode.q1001_1100;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        } else {
            TreeNode root = new TreeNode(preorder[0]);
            for (int i = 1; i < preorder.length; i++) {
                int p = preorder[i];
                TreeNode r = parentNode(root, p);
                TreeNode pNode = new TreeNode(p);
                if (r.val > p) {
                    r.left = pNode;
                } else {
                    r.right = pNode;
                }
            }
            return root;
        }
    }

    public TreeNode parentNode(TreeNode root, int val) {
        if (val > root.val) {
            if (root.right != null) {
                return parentNode(root.right, val);
            } else {
                return root;
            }
        } else {
            if (root.left != null) {
                return parentNode(root.left, val);
            } else {
                return root;
            }
        }
    }
}
