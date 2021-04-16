package com.wentjiang.leetcode.utils;

/**
 * @author wentao.jiang
 * @date 2020/1/27 8:28 AM
 * @description 公共使用的treenode
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    /**
     * 根据广度优先遍历生成 treeNode
     *
     * @param nums 广度数组,可以直接使用leetcode页面上给的数组
     * @return 返回当前的treeNode
     */
    public static TreeNode createTreeNodeByArray(Integer[] nums) {
        int length = nums.length;
        int layer = Double.valueOf(Math.ceil(Math.log(length - 1) / Math.log(2))).intValue();
        return new TreeNode(0);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            int layer = Double.valueOf(Math.ceil(Math.log(i - 1) / Math.log(2))).intValue();
            System.out.println(i + "   layer  " + layer);
        }

    }


}
