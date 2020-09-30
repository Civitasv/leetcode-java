package main;

import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals the given sum.
 */
public class PathSum {
    /**
     * recursion
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            if (root.val == sum)
                return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    /**
     * iteration
     *
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null)
            return false;
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sub = new Stack<>();
        path.push(root);
        sub.push(root.val);
        while (!path.isEmpty()) {
            root = path.pop();
            int val = sub.pop();
            if (root.left == null && root.right == null && val == sum)
                return true;
            if (root.left != null) {
                path.push(root.left);
                sub.push(root.left.val + val);
            }
            if (root.right != null) {
                path.push(root.right);
                sub.push(root.right.val + val);
            }
        }
        return false;
    }
}
