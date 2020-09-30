package test;


import main.SameTree;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class SameTreeTest {
    @Test
    void test() {
        SameTree sameTree = new SameTree();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;


        node4.right = node5;

        //System.out.println(sameTree.isSameTree2(node1, node4));
        System.out.println(node1.toString2());
    }
}