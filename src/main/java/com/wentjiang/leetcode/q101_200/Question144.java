package com.wentjiang.leetcode.q101_200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * 
 * @date 2020/1/26 12:06 PM
 * 
 * @description
 */
public class Question144 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        viewTree(root, result);
        return result;
    }

    public void viewTree(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
        } else {
            return;
        }
        viewTree(root.left, result);
        viewTree(root.right, result);
    }
}
