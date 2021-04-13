package test;

import main.TreeNode;
import main.everyday.MinimumDistanceBetweenBSTNodes;
import org.junit.jupiter.api.Test;

class MinimumDistanceBetweenBSTNodesTest {

    @Test
    void test() {
        MinimumDistanceBetweenBSTNodes nodes = new MinimumDistanceBetweenBSTNodes();
        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        System.out.println(nodes.minDiffInBST(root1));
    }
}