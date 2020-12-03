package test;

import main.TreeNode;
import main.everyday.CountCompleteTreeNodes;
import org.junit.jupiter.api.Test;

class CountCompleteTreeNodesTest {

    @Test
    void test() {
        CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();
        TreeNode root = new TreeNode(1);
        TreeNode node = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        root.left = node;
        node.right = node2;

        System.out.println(countCompleteTreeNodes.countNodes(root));
    }
}