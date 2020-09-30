package test;

import main.PathSumIII;
import main.TreeNode;
import org.junit.jupiter.api.Test;

class PathSumIIITest {

    @Test
    void test() {
        PathSumIII sumIII = new PathSumIII();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-2);
        TreeNode node7 = new TreeNode(-1);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node4.left = node7;

        /*TreeNode node1 = new TreeNode(-2);
        TreeNode node2 = new TreeNode(-3);*/
        System.out.println(sumIII.pathSum2(node1, -1));
    }
}