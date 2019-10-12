package com.wentjiang.leetcode.q101_200;

import java.util.Arrays;

/**
 * @author wentao.jiang
 * @date 2019/10/12 1:56 PM
 * @description
 */
public class Question105 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        int indexNum = preorder[0];
        TreeNode root = new TreeNode(indexNum);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == indexNum) {
                index = i;
                break;
            }
        }
        //构建左子树
        if (index >= 1) {
            root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1)
                , Arrays.copyOfRange(inorder, 0, index));
        }
        //构建右子树
        if (index <= length - 1) {
            root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, length)
                , Arrays.copyOfRange(inorder, index + 1, length));
        }
        return root;
    }
}
