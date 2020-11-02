package main;

/**
 * You are given the root of a binary search tree (BST),
 * where exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
 * <p>
 * Follow up: A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree {
    public void recoverTree(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null && root.left.val > root.val) {
            swap(root, root.left);
        }
        if (root.right != null && root.right.val < root.val) {
            swap(root, root.right);
        }
        recoverTree(root.left);
        recoverTree(root.right);
    }

    private void swap(TreeNode node, TreeNode node2) {
        int temp = node.val;
        node.val = node2.val;
        node2.val = temp;
    }
}
