package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2020/1/27 8:42 AM
 * @description 使用迭代法
 */
public class Question145_1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        if (root != null) {
            stack.add(root);
        }
        while (!stack.isEmpty()) {
            TreeNode current = stack.pollLast();
            result.addFirst(current.val);
            if (current.left != null) {
                stack.add(current.left);
            }
            if (current.right != null) {
                stack.add(current.right);
            }
        }
        return result;
    }
}
