package com.wentjiang.leetcode.q901_1000;

import com.wentjiang.leetcode.utils.TreeNode;

public class Question993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        ParentAndLayer xParentAndLayer = findParentAndLayer(root, x, 0);
        ParentAndLayer yParentAndLayer = findParentAndLayer(root, y, 0);
        return xParentAndLayer != null && yParentAndLayer != null
                && xParentAndLayer.parent.val != yParentAndLayer.parent.val
                && xParentAndLayer.layer == yParentAndLayer.layer;
    }

    private ParentAndLayer findParentAndLayer(TreeNode treeNode, int value, int layer) {
        if (treeNode == null) {
            return null;
        }
        if (treeNode.left != null) {
            if (treeNode.left.val == value) {
                return new ParentAndLayer(treeNode, layer);
            } else {
                ParentAndLayer leftParentAndLayer = findParentAndLayer(treeNode.left, value, layer + 1);
                if (leftParentAndLayer != null) {
                    return leftParentAndLayer;
                }
            }
        }
        if (treeNode.right != null) {
            if (treeNode.right.val == value) {
                return new ParentAndLayer(treeNode, layer);
            } else {
                ParentAndLayer rightParentAndLayer = findParentAndLayer(treeNode.right, value, layer + 1);
                if (rightParentAndLayer != null) {
                    return rightParentAndLayer;
                }
            }
        }
        return null;
    }

    class ParentAndLayer {
        private TreeNode parent;
        private int layer;

        public ParentAndLayer(TreeNode parent, int layer) {
            this.parent = parent;
            this.layer = layer;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public int getLayer() {
            return layer;
        }

        public void setLayer(int layer) {
            this.layer = layer;
        }
    }
}
