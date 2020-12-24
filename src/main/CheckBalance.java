package main;

/**
 * 检查平衡性
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 */
public class CheckBalance {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(length(root.left) - length(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else return false;
    }

    private int length(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        int left = 0, right = 0;
        if (node.left != null) {
            left = length(node.left);
        }
        if (node.right != null) {
            right = length(node.right);
        }
        return 1 + Math.max(left, right);
    }
}
