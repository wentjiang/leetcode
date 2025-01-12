package com.wentjiang.leetcode.q101_200;

import com.wentjiang.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question173 {

}

class BSTIterator {

    private List<Integer> list = new ArrayList<>();

    private Iterator<Integer> iterator = null;

    /**
     * 将树转换为数组存储
     *
     * @param root
     */
    public BSTIterator(TreeNode root) {
        visitTree(root);
        iterator = list.iterator();
    }

    private void visitTree(TreeNode root) {
        if (root != null) {
            visitTree(root.left);
            list.add(root.val);
            visitTree(root.right);
        }
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}
