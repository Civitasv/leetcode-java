package main.offer;

import main.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class RebuildBinaryTree {
    private final Map<Integer, Integer> indexes = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexes.put(inorder[i], i);
        }
        return buildTree(0, preorder.length, 0, inorder.length, preorder, inorder);
    }

    public TreeNode buildTree(int preStart, int preEnd, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart >= preEnd || inStart >= inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int indexRoot = indexes.get(root.val);

        int leftSize = indexRoot - inStart;
        root.left = buildTree(preStart + 1, preStart + 1 + leftSize, inStart, indexRoot, preorder, inorder);
        root.right = buildTree(preStart + 1 + leftSize, preEnd, indexRoot + 1, inEnd, preorder, inorder);
        return root;
    }
}
