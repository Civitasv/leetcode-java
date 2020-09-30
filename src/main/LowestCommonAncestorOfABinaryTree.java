package main;

import java.util.Queue;

public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (isInTree(root.left, p) && isInTree(root.left, q)) return lowestCommonAncestor(root.left, p, q);
        else if (isInTree(root.right, p) && isInTree(root.right, q)) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

    public boolean isInTree(TreeNode root, TreeNode node) {
        if (root == null) return false;
        if (root == node) return true;
        return isInTree(root.left, node) || isInTree(root.right, node);
    }

    private TreeNode ans;

    public LowestCommonAncestorOfABinaryTree() {
        // Variable to store LCA node.
        this.ans = null;
    }

    private boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {

        // If reached the end of a branch, return false.
        if (currentNode == null) {
            return false;
        }

        // Left Recursion. If left recursion returns true, set left = 1 else 0
        int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;

        // Right Recursion
        int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;

        // If the current node is one of p or q
        int mid = (currentNode == p || currentNode == q) ? 1 : 0;


        // If any two of the flags left, right or mid become True
        if (mid + left + right >= 2) {
            this.ans = currentNode;
        }

        // Return true if any one of the three bool values is True.
        return (mid + left + right > 0);
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        this.recurseTree(root, p, q);
        return this.ans;
    }
}
