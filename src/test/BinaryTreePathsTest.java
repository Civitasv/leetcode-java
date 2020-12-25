package test;

import main.BinaryTreePaths;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreePathsTest {

    @Test
    void test() {
        BinaryTreePaths paths = new BinaryTreePaths();
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        System.out.println(paths.binaryTreePaths(node1));
    }
}