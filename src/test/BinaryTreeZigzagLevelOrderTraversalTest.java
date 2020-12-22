package test;


import main.TreeNode;
import main.everyday.BinaryTreeZigzagLevelOrderTraversal;
import org.junit.jupiter.api.Test;

class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    void test() {
        BinaryTreeZigzagLevelOrderTraversal traversal = new BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        TreeNode node = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node;
        root.right = node2;
        node.left = node3;
        node2.right = node4;
        System.out.println(traversal.zigzagLevelOrder(root));
    }
}