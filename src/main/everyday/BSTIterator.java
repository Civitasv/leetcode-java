package main.everyday;

import main.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BSTIterator {
    private final Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new ArrayDeque<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode curr = stack.pop();
        TreeNode node = curr.right;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        return curr.val;
    }

    public boolean hasNext() {
        return stack.isEmpty();
    }
}
