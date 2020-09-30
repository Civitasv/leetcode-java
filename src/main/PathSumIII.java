package main;

import java.util.ArrayDeque;
import java.util.Queue;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int count = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            count += number(node, sum);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return count;
    }

    public int pathSum2(TreeNode root, int sum) {
        if (root == null) return 0;
        int count = number(root, sum);
        if (root.left != null) count += pathSum2(root.left, sum);
        if (root.right != null) count += pathSum2(root.right, sum);
        return count;
    }

    public int number(TreeNode root, int sum) {
        if (root == null) return 0;
        if (root.val == sum) return 1 + number(root.left, 0) + number(root.right, 0);
        return number(root.left, sum - root.val) + number(root.right, sum - root.val);
    }
}
