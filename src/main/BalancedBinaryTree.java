package main;

/**
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as:
 * <p>
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) <= 1)
            return isBalanced(root.left) && isBalanced(root.right);
        else
            return false;
    }

    int height(TreeNode root) {
        int depth = 0;
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            depth = height(root.left) + 1;
        }
        if (root.right != null) {
            int val = height(root.right) + 1;
            depth = Math.max(depth, val);
        }
        return depth;
    }
}