package test;


import main.SymmetricTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {
    @Test
    void test() {
        SymmetricTree symmetricTree = new SymmetricTree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        System.out.println(symmetricTree.isSymmetric(node1));
    }
}