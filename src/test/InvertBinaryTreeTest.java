package test;

import main.InvertBinaryTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {
    @Test
    void test() {
        InvertBinaryTree binaryTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        TreeNode left = new TreeNode(7);
        TreeNode right = new TreeNode(2);
        TreeNode lleft = new TreeNode(9);
        TreeNode lright = new TreeNode(6);
        root.left = left;
        root.right = right;
        left.left = lleft;
        left.right = lright;
        TreeNode node = binaryTree.invertTree2(root);
        System.out.println(root);
    }
}