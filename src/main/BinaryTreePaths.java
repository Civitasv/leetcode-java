package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        binaryTreePaths(res, "", root);
        return res;
    }

    private void binaryTreePaths(List<String> res, String item, TreeNode node) {
        if (node == null) {
            return;
        }
        StringBuilder builder = new StringBuilder(item);
        builder.append(node.val);
        if (node.left == null && node.right == null) {
            res.add(builder.toString());
            return;
        } else builder.append("->");

        binaryTreePaths(res, builder.toString(), node.left);
        binaryTreePaths(res, builder.toString(), node.right);
    }
}
