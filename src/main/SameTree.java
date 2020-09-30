package main;


import java.util.ArrayDeque;
import java.util.Deque;

public class SameTree {
    /**
     * recursion
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Iteration
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!check(p, q)) return false;

        Deque<TreeNode> pDeque = new ArrayDeque<>();
        Deque<TreeNode> qDeque = new ArrayDeque<>();
        pDeque.add(p);
        qDeque.add(q);
        while (!pDeque.isEmpty()) {
            p = pDeque.remove();
            q = qDeque.remove();
            if (!check(p, q))
                return false;
            if (p != null) {
                if (!check(p.left, q.left)) return false;
                if (p.left != null) {
                    pDeque.add(p.left);
                    qDeque.add(q.left);
                }
                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    pDeque.add(p.right);
                    qDeque.add(q.right);
                }
            }
        }
        return true;
    }

    /**
     * check if the same
     *
     * @param p
     * @param q
     * @return
     */
    public boolean check(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        return p.val == q.val;
    }
}
