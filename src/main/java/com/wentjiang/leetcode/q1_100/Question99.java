package com.wentjiang.leetcode.q1_100;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Question99 {

    /**
     * 先遍历二叉搜索树,可能有两个位置逆序,或一个位置逆序,如果两个位置逆序的话,中间有间隔,如果只有一个位置逆序的话,中间没有间隔
     * 先存在数组中,然后找数组中的逆序,交换
     *
     * @param root
     */

    public void recoverTree(TreeNode root) {

        List<TreeNode> list = getList(root);
        int[] position = findWrong(list);
        TreeNode n1 = list.get(position[0]);
        TreeNode n2 = list.get(position[1]);
        int t = n1.val;
        n1.val = n2.val;
        n2.val = t;
    }

    private int[] findWrong(List<TreeNode> list) {
        int p1 = -1;
        int p2 = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).val < list.get(i).val) {
                p1 = i + 1;
                if (p2 == -1){
                    p2 = i;
                }else{
                    break;
                }
            }
        }

        return new int[]{p1, p2};
    }

    private List<TreeNode> getList(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root != null) {
            list.addAll(getList(root.left));
            list.add(root);
            list.addAll(getList(root.right));
        }

        return list;
    }
}
