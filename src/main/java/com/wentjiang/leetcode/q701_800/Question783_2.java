package com.wentjiang.leetcode.q701_800;

import com.wentjiang.leetcode.utils.TreeNode;


/**
 * 使用二叉搜索树排好序的性质,直接一次遍历求解
 */
public class Question783_2 {
    int pre = -1;
    int ans = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        findMin(root);
        return ans;
    }

    public void findMin(TreeNode root) {
        if (root == null) {
            return;
        }
        findMin(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        findMin(root.right);
    }

}
