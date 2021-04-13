package main.everyday;

import main.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class MinimumDistanceBetweenBSTNodes {
    public int minDiffInBST(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(bfs(root), Math.min(minDiffInBST(root.left), minDiffInBST(root.right)));
    }

    private int bfs(TreeNode node) {
        int min = Integer.MAX_VALUE;
        int val = node.val;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            if (node1.left != null) {
                queue.add(node1.left);
                min = Math.min(min, Math.abs(val - node1.left.val));
            }
            if (node1.right != null) {
                queue.add(node1.right);
                min = Math.min(min, Math.abs(val - node1.right.val));
            }
        }
        return min;
    }
}
