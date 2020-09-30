package main;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {

    /**
     * recursion
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            depth = maxDepth(root.left) + 1;
        }
        if (root.right != null) {
            int val = maxDepth(root.right) + 1;
            depth = depth > val ? depth : val;
        }
        return depth;
    }

    /**
     * iteration
     *
     * @param root
     * @return
     */
    public int maxDepth2(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            for (int i = 0, n = queue.size(); i < n; i++) {
                TreeNode node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

}
