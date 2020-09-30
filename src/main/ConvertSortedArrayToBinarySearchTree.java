package main;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth
 * of the two subtrees of every node never differ by more than 1.
 */
public class ConvertSortedArrayToBinarySearchTree {
    /*public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int lo = 0;
        int hi = nums.length - 1;
        int rmid = (lo + hi) / 2, lmid = (lo + hi) / 2;

        TreeNode root = new TreeNode(nums[(lo + hi) / 2]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty() && (lo != lmid || hi != rmid)) {
            TreeNode node = queue.remove();
            if (lo != lmid) {
                TreeNode leftNode = new TreeNode(nums[(lo + lmid) / 2]);
                node.left = leftNode;
                queue.add(leftNode);
                lmid--;
            }
            if (hi != rmid) {
                TreeNode rightNode;
                if ((hi + rmid) % 2 != 0) {
                    rightNode = new TreeNode(nums[(hi + rmid) / 2 + 1]);
                } else {
                    rightNode = new TreeNode(nums[(hi + rmid) / 2]);
                }
                node.right = rightNode;
                queue.add(rightNode);
                rmid++;
            }
        }
        return root;
    }*/

    public TreeNode sortedArrayToBST2(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }
}