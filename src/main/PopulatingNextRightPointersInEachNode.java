package main;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 填充每个节点的下一个右侧节点指针
 */
public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null)
            return null;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node left = null, right = null;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node != null) {
                    if (node.left != null) {
                        left = node.left;
                        if (right != null)
                            right.next = left;
                        right = node.right;
                        left.next = right;
                        queue.add(left);
                        queue.add(right);
                    }
                }
            }
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};