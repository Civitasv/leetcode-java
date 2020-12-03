package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.
 * <p>
 * Determine the maximum amount of money the thief can rob tonight without alerting the police.
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] val = robSub(root);
        return Math.max(val[0], val[1]);
    }

    public int[] robSub(TreeNode root) {
        if (root == null)
            return new int[2];
        // rob left tree
        int[] left = robSub(root.left);
        // rob right tree
        int[] right = robSub(root.right);
        int[] res = new int[2];
        // not robbed
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        // robbed
        res[1] = root.val + left[0] + right[0];
        return res;
    }
}
