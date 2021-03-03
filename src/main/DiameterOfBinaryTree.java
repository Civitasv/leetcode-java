package main;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 二叉树的直径
 */
public class DiameterOfBinaryTree {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        high(root);
        return maxDiameter;
    }

    private int high(TreeNode node) {
        if (node == null) return 0;
        int left = high(node.left), right = high(node.right);
        maxDiameter = Math.max(left + right, maxDiameter);
        return 1 + Math.max(left, right);
    }
}
