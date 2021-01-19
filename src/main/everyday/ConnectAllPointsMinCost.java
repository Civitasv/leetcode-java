package main.everyday;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 连接所有点的最小费用
 */
public class ConnectAllPointsMinCost {
    public int minCostConnectPoints(int[][] points) {
        int cost = 0;
        // Prim算法
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1])); // 存储数组，索引--距离值
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] point = points[0];
        visited[0] = true;

        while (--n != 0) {
            for (int i = 0; i < points.length; i++) {
                if (!visited[i])
                    pq.offer(new int[]{i, manhattan(point, points[i])});
            }
            // 获取最小值
            while (!pq.isEmpty()) {
                int[] min = pq.poll();
                if (!visited[min[0]]) { // 必须是已访问的点到未访问点的距离
                    visited[min[0]] = true;
                    cost += min[1];
                    point = points[min[0]];
                    break;
                }
            }
        }
        return cost;
    }

    private int manhattan(int[] point, int[] point2) {
        return Math.abs(point[0] - point2[0]) + Math.abs(point[1] - point2[1]);
    }
}
