package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthOfBinaryTree {
    /**
     * recursion
     *
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left != null) {
            depth = minDepth(root.left) + 1;

        }
        if (root.right != null) {
            int temp = minDepth(root.right) + 1;
            if (depth == 0) {
                depth = temp;
            } else {
                depth = depth > temp ? temp : depth;
            }
        }
        return depth;
    }

    /**
     * iteration
     *
     * @param root
     * @return
     */
    public int minDepth2(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            depth++;
            for (int i = 0, n = queue.size(); i < n; i++) {
                TreeNode node = queue.remove();
                if (node.left == null && node.right == null)
                    return depth;
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
