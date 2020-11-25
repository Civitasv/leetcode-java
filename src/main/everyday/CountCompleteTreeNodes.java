package main.everyday;

import main.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 每日一题 1
 * Given a complete binary tree, count the number of nodes.
 * <p>
 * Note:
 * <p>
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int level = level(root);
        int lo = 1 << (level - 1), hi = (1 << level) - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (exists(root, level, mid)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    // 得到level
    private int level(TreeNode node) {
        int count = 0;
        while (node != null) {
            node = node.left;
            count++;
        }
        return count;
    }

    // if index k exists in node
    private boolean exists(TreeNode root, int level, int k) {
        int bits = 1 << (level - 2);
        TreeNode node = root;
        while (node != null && bits > 0) {
            if ((bits & k) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            bits >>= 1;
        }
        return node != null;
    }
}
