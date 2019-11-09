package com.wentjiang.leetcode.q101_200;

import java.util.Arrays;

/**
 * @author wentao.jiang
 * @date 2019/11/9 10:42 AM
 * @description 思路:每次从后续排列的最后一个元素查找,这个元素是根节点,分别构建左子树和右子树
 */
public class Question106 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int length = inorder.length;

        //获取后序遍历中后边的元素第一个出现在当前中序的元素当做root,因为递归之后,后序的元素可能不在中序的数组中,这里用遍历方式解决
        TreeNode root = null;
        int index = -1;
        for (int j = postorder.length - 1; j >= 0; j--) {
            for (int i = 0; i < inorder.length; i++) {
                if (postorder[j] == inorder[i]) {
                    index = i;
                    root = new TreeNode(postorder[j]);
                    break;
                }
            }
            if (root != null) {
                break;
            }
        }
        if (root == null) {
            return null;
        }

        //构建左子树
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index)
            , Arrays.copyOfRange(postorder, 0, postorder.length - 1));
        //构建右子树
        root.right = buildTree(Arrays.copyOfRange(inorder, index + 1, length)
            , Arrays.copyOfRange(postorder, 0, postorder.length - 1));


        return root;
    }
}
