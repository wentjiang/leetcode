package com.wentjiang.leetcode.q401_500;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question450 {

    /**
     * \
     * 先找到位置,然后删除节点,节点可能有无父节点, 节点的孩子重排, 所有左孩子,放到右节点的最左孩子的位置
     *
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //都不为null的情况,合并两棵树,返回合并后的根节点
            TreeNode successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            successor.left = root.left;
            return root.right;
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        return root;
    }
}
