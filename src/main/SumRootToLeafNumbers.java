package main;

import java.util.List;

/**
 * 求根到叶子节点数字之和
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * <p>
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 * <p>
 * 计算从根到叶子节点生成的所有数字之和。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    private int sum(TreeNode node, int item) {
        if (node == null) {
            return 0;
        }
        item = item * 10 + node.val;
        if (node.left == null && node.right == null) {
            return item;
        }
        return sum(node.left, item) + sum(node.right, item);
    }
}
