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
        TreeNode currentNode = root;
        TreeNode parentNode = null;
        while (currentNode != null) {
            if (currentNode.val == key) {
                TreeNode leftChild = currentNode.left;
                TreeNode rightChild = currentNode.right;
                TreeNode mergedTree = mergeTwoTree(leftChild,rightChild);

            } else {
                parentNode = currentNode;
                if (key > currentNode.val) {
                    currentNode = currentNode.right;
                } else {
                    currentNode = currentNode.left;
                }
            }
        }
        return root;
    }

    private TreeNode mergeTwoTree(TreeNode leftChild, TreeNode rightChild) {
        if (leftChild == null){
            return rightChild;
        }
        if (rightChild == null){
            return null;
        }

        TreeNode parent = null;
        TreeNode currentNode = leftChild;
        while(currentNode != null){
            parent = currentNode;
            currentNode = currentNode.right;
        }
        parent.right = rightChild;


        return leftChild;
    }
}
