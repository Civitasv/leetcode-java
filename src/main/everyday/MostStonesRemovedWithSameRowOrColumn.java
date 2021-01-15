package main.everyday;

/**
 * 移除最多的同行或同列石头
 * n 块石头放置在二维平面中的一些整数坐标点上。每个坐标点上最多只能有一块石头。
 * <p>
 * 如果一块石头的 同行或者同列 上有其他石头存在，那么就可以移除这块石头。
 * <p>
 * 给你一个长度为 n 的数组 stones ，其中 stones[i] = [xi, yi] 表示第 i 块石头的位置，返回 可以移除的石子 的最大数量。
 */
public class MostStonesRemovedWithSameRowOrColumn {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        if (n == 0 || n == 1)
            return 0;
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                visited[i] = true;
                removeStones(stones, i, visited);
            }
        }
        return n - count;
    }

    private void removeStones(int[][] stones, int start, boolean[] visited) {
        for (int i = 0; i < stones.length; i++) {
            if (!visited[i] && (stones[i][0] == stones[start][0] || stones[i][1] == stones[start][1])) {
                visited[i] = true;
                removeStones(stones, i, visited);
            }
        }
    }

}
