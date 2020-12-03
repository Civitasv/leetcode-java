package test;


import main.RecoverBinarySearchTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class RecoverBinarySearchTreeTest {

    @Test
    void test() {
        RecoverBinarySearchTree binarySearchTree = new RecoverBinarySearchTree();
        TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        root.left = node;
        node.right = node2;
        System.out.println(root);
        binarySearchTree.recoverTree(root);
        System.out.println(root);
    }
}