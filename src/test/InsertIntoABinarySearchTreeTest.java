package test;

import main.InsertIntoABinarySearchTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntoABinarySearchTreeTest {

    @Test
    void insertIntoBST() {
        // root = [4,2,7,1,3], val = 5
        TreeNode root = new TreeNode(4);
        TreeNode node = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);

        root.left = node;
        root.right = node2;

        node.left = node3;
        node.right = node4;

        InsertIntoABinarySearchTree insertIntoABinarySearchTree = new InsertIntoABinarySearchTree();
        System.out.println(insertIntoABinarySearchTree.insertIntoBST(null, 5));
    }
}