package main;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given the root of a binary tree, find the maximum value V for which
 * there exist different nodes A and B where V = |A.val - B.val| and A is an ancestor of B.
 * <p>
 * A node A is an ancestor of B if either: any child of A is equal to B, or any child of A is an ancestor of B.
 */
public class MaximumDifferenceBetweenNodeAndAncestor {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return 0;
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            max = Math.max(maxDiff(treeNode), max);
            if (treeNode.left != null)
                queue.add(treeNode.left);
            if (treeNode.right != null)
                queue.add(treeNode.right);
        }
        return max;
    }

    public int maxDiff(TreeNode node) {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            max = Math.max(Math.abs(treeNode.val - node.val), max);
            if (treeNode.left != null)
                queue.add(treeNode.left);
            if (treeNode.right != null)
                queue.add(treeNode.right);
        }
        return max;

    }
}
