package com.wentjiang.leetcode.q201_300;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question230 {

    /**
     * 使用中序遍历找到第K个返回
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root =stack.pop();
            k--;
            if (k == 0){
                break;
            }
            root = root.right;
        }
        return root.val;
    }
}
