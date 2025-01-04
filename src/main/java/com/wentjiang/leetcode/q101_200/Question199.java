package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question199 {

    List<Integer> result = new ArrayList<>();

    /**
     * 中右序遍历,并且需要记录当前遍历的深度
     *
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        searchTree(root, 1);
        return result;
    }

    public void searchTree(TreeNode root, int deep) {
        if (root != null) {
            if (result.size() < deep) {
                result.add(root.val);
            }
            if (root.right != null) {
                searchTree(root.right, deep + 1);
            }
            if (root.left != null) {
                searchTree(root.left, deep + 1);
            }
        }
    }
}
