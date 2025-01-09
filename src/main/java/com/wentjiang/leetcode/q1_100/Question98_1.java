package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question98_1 {

    /**
     * 按顺序遍历,后一个需要大于前一个
     */

    public boolean isValidBST(TreeNode root) {
        Integer pre = null;
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre == null){
                pre = root.val;
            }else{
                if (root.val <= pre){
                    return false;
                }
                pre = root.val;
            }
            root = root.right;
        }
        return true;
    }
}
