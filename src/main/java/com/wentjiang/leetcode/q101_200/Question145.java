package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wentao.jiang
 * @date 2020/1/27 8:27 AM
 * @description 递归法后序遍历
 */
public class Question145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            viewTree(root, result);
        }
        return result;
    }

    public void viewTree(TreeNode current, List<Integer> result) {
        if (current.left != null){
            viewTree(current.left,result);
        }
        if (current.right != null) {
            viewTree(current.right,result);
        }
        result.add(current.val);
    }
}
