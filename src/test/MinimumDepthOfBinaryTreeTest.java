package test;


import main.MinimumDepthOfBinaryTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {

    @Test
    void test() {
        MinimumDepthOfBinaryTree binaryTree = new MinimumDepthOfBinaryTree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        //node1.left = node2;
        node1.right = node3;
        //node2.left = node4;
        //node2.right = node5;
        //node4.left = node6;
        //node4.right = node7;
        System.out.println(binaryTree.minDepth2(node1));
    }
}