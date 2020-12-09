package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        if (this.left == null && this.right == null) {
            return this.val + "";
        } else if (this.left != null && this.right == null) {
            return this.val + "--left--" + this.left.toString();
        } else if (this.right != null && this.left == null) {
            return this.val + "--right--" + this.right.toString();
        } else
            return this.val + "--left--" + this.left.toString() + "--right--" + this.right.toString();
    }

    // DFS 使用递归或栈
    // BFS 使用队列
    public String toString2() {
        StringBuilder res = new StringBuilder();
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(this);
        while (!deque.isEmpty()) {
            TreeNode node = deque.remove();
            res.append(node.val);
            if (node.left != null)
                deque.add(node.left);
            if (node.right != null)
                deque.add(node.right);
        }
        return res.toString();
    }
}