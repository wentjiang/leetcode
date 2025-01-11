package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question538 {

    int sum = 0;

    /**
     * 先遍历 右, 然后中, 然后左
     *
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        visit(root);
        return root;
    }

    public void visit(TreeNode root) {
        if (root == null) {
            return;
        } else {
            visit(root.right);
            root.val += sum ;
            sum = root.val;
            visit(root.left);
        }
    }
}
