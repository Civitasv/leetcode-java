package main;

import java.util.*;

public class VerticalOrderTraversalOfABinaryTree {
    private class Pair {
        TreeNode node;
        int x, y;

        Pair(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }

    private class ByY implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            if (o1.y == o2.y)
                return o1.node.val - o2.node.val;

            if (o1.y < o2.y) return 1;
            return -1;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Map<Integer, PriorityQueue<Pair>> map = new HashMap<>();
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root, 0, 0));
        int min = 0, max = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.remove();
            TreeNode node = pair.node;
            int px = pair.x, py = pair.y;
            min = Math.min(px, min);
            max = Math.max(px, max);

            if (!map.containsKey(px)) map.put(px, new PriorityQueue<>(new ByY()));
            map.get(px).add(pair);

            if (node.left != null) {
                queue.add(new Pair(node.left, px - 1, py - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, px + 1, py - 1));
            }
        }

        for (int x = min; x <= max; x++) {
            PriorityQueue<Pair> pq = map.get(x);
            List<Integer> item = new ArrayList<>();
            while (!pq.isEmpty()) {
                item.add(pq.poll().node.val);
            }
            results.add(item);
        }
        return results;
    }


}
