package com.wentjiang.leetcode.q501_600;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question572 {
    /**
     * 中序遍历两个树,如果root的树包含subRoot的子字符串,则包含.
     *
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootString = stringTheTree(root);
        String subRootString = stringTheTree(subRoot);
        return rootString.contains(subRootString);
    }

    public String stringTheTree(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root != null) {
            return sb.append(",").append(root.val)
                    .append(",").append(stringTheTree(root.left))
                    .append(",").append(stringTheTree(root.right))
                    .append(",").toString();
        } else {
            return "null";
        }
    }
}
