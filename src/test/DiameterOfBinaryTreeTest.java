package test;

import main.DiameterOfBinaryTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class DiameterOfBinaryTreeTest {

    @Test
    void test() {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        root.left = node;
        root.right = node1;
        node.left = node2;
        node.right = node3;
        System.out.println(tree.diameterOfBinaryTree(root));
    }
}