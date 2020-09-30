package test;


import main.ConvertSortedArrayToBinarySearchTree;
import org.junit.jupiter.api.Test;

class ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    void test() {
        ConvertSortedArrayToBinarySearchTree searchTree = new ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10, -3, 0, 5, 9};
        System.out.println(searchTree.sortedArrayToBST2(nums));
    }
}