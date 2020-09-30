package test;

import main.TreeNode;
import main.VerticalOrderTraversalOfABinaryTree;
import org.junit.jupiter.api.Test;

class VerticalOrderTraversalOfABinaryTreeTest {
    @Test
    void test() {
        VerticalOrderTraversalOfABinaryTree binaryTree = new VerticalOrderTraversalOfABinaryTree();

        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(14);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        node2.left = node6;
        node2.right = node7;

        System.out.println(binaryTree.verticalTraversal(node1));
    }
}