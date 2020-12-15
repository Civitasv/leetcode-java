package main.offer;

import main.TreeNode;

import java.util.*;

/**
 * 逐层打印二叉树
 *
 * @author Civitasv
 */
public class RandomBinaryTree {
    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[]{};
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
}
