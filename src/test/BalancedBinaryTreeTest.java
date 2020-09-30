package test;


import main.BalancedBinaryTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    @Test
    void test() {
        BalancedBinaryTree tree = new BalancedBinaryTree();
        //[1,2,2,3,null,null,3,4,null,null,4]
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        node4.left = node6;
        node5.right = node7;
        System.out.println(tree.isBalanced(node1));
    }
}