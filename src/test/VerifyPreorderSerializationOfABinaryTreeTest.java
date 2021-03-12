package test;

import main.everyday.VerifyPreorderSerializationOfABinaryTree;
import org.junit.jupiter.api.Test;

class VerifyPreorderSerializationOfABinaryTreeTest {
    @Test
    void test(){
        VerifyPreorderSerializationOfABinaryTree tree = new VerifyPreorderSerializationOfABinaryTree();
        System.out.println(tree.isValidSerialization("9,#,92,#,#"));
    }
}