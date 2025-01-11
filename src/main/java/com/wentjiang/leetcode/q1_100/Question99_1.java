package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question99_1 {
    /**
     * 先遍历二叉搜索树,可能有两个位置逆序,或一个位置逆序,如果两个位置逆序的话,中间有间隔,如果只有一个位置逆序的话,中间没有间隔
     * 考虑使用一次遍历的情况, 需要手动记录pre节点
     *
     * @param root
     */

    private TreeNode pre = null;
    private TreeNode node1 = null;
    private TreeNode node2 = null;

    public void recoverTree(TreeNode root) {
        visitTree(root);
        int t = node1.val;
        node1.val = node2.val;
        node2.val = t;
    }

    private void visitTree(TreeNode root) {
        if (root != null) {
            visitTree(root.left);
            if (pre != null) {
                if (pre.val > root.val) {
                    node2 = root;
                    if (node1 == null) {
                        node1 = pre;
                    }
                }
            }
            pre = root;

            visitTree(root.right);
        }
    }
}
