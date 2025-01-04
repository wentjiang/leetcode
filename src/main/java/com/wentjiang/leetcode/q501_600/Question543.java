package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question543 {

    int max = 0;

    /**
     * 树的直径由 所有节点的左右子树高度最大值的和决定
     *
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        high(root);
        return max;
    }

    /**
     * 第一个返回该树最高的子树,第二个返回该数的直径
     *
     * @param root
     * @return
     */
    public int[] high(TreeNode root) {
        if (root == null) {
            return new int[]{-1, 0};
        } else {
            int leftHigh = high(root.left)[0] + 1;
            int rightHigh = high(root.right)[0] + 1;
            int diameter = leftHigh + rightHigh;
            max = Math.max(max, diameter);
            return new int[]{Math.max(leftHigh, rightHigh), diameter};
        }
    }
}
