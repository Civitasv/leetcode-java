package test;

import main.SumRootToLeafNumbers;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class SumRootToLeafNumbersTest {

    @Test
    void test() {
        SumRootToLeafNumbers leafNumbers = new SumRootToLeafNumbers();
        TreeNode root = new TreeNode(4);
        TreeNode node = new TreeNode(9);
        TreeNode node1 = new TreeNode(0);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        root.left = node;
        root.right = node1;
        node.left = node2;
        node.right = node3;
        System.out.println(leafNumbers.sumNumbers(root));
    }
}