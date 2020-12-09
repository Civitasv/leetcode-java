package test;


import main.offer.RebuildBinaryTree;
import org.junit.jupiter.api.Test;

class RebuildBinaryTreeTest {

    @Test
    void test() {
        RebuildBinaryTree binaryTree = new RebuildBinaryTree();
        System.out.println(binaryTree.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
    }
}