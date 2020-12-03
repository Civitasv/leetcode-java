package main;

/**
 * You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
 * <p>
 * Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
 */
public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        // 将val插入到查找树中
        insert(root, val);
        return root;
    }

    public void insert(TreeNode root, int val) {
        if (val < root.val) {
            // 说明应该在root的左子树
            if (root.left != null)
                insertIntoBST(root.left, val);
            else root.left = new TreeNode(val);
        } else {
            // 说明应该在root的右子树
            if (root.right != null)
                insertIntoBST(root.right, val);
            else root.right = new TreeNode(val);
        }
    }
}
