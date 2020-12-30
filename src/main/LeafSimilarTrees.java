package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 叶子相似的树
 * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 * 举个例子，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
 * <p>
 * 如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 * <p>
 * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
 */
public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        dfs(list1, root1);
        List<Integer> list2 = new ArrayList<>();
        dfs(list2, root2);
        if (list1.size() != list2.size())
            return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).intValue() != list2.get(i).intValue())
                return false;
        }
        return true;
    }

    private void dfs(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        dfs(list, root.left);
        dfs(list, root.right);
    }
}
