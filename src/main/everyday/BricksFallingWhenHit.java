package main.everyday;

/**
 * 打砖块
 */
public class BricksFallingWhenHit {
    public static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int rows = grid.length, cols = grid[0].length;
        int[][] temp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(grid[i], 0, temp[i], 0, cols);
        }
        for (int[] hit : hits) { // 去除砖块
            temp[hit[0]][hit[1]] = 0;
        }
        int size = rows * cols;
        // 多加的1是虚拟屋顶节点
        UnionFind uf = new UnionFind(size + 1);
        // 首先初始化顶层
        for (int i = 0; i < cols; i++) {
            if (temp[0][i] == 1)
                uf.union(i, size);
        }
        // 然后扫描下层
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (temp[i][j] == 1) {
                    // 扫描上侧和左侧
                    if (temp[i - 1][j] == 1)
                        uf.union(getIndex(i, j, cols), getIndex(i - 1, j, cols));
                    if (j > 0 && temp[i][j - 1] == 1)
                        uf.union(getIndex(i, j, cols), getIndex(i, j - 1, cols));
                }
            }
        }
        // 反向操作
        int[] result = new int[hits.length];
        for (int i = hits.length - 1; i >= 0; i--) {
            int[] hit = hits[i];
            int row = hit[0], col = hit[1];
            if (grid[row][col] == 0)
                continue;
            int origin = uf.getSize(size);
            if (row == 0)
                uf.union(col, size);
            // 往四个方向看一下
            for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0], newCol = col + direction[1];
                if (inArea(newRow, newCol, rows, cols) && temp[newRow][newCol] == 1)
                    uf.union(getIndex(newRow, newCol, cols), getIndex(row, col, cols));
            }
            // 补回之后与屋顶相连的砖块数
            int current = uf.getSize(size);
            // 减去的 1 是逆向补回的砖块（正向移除的砖块），与 0 比较大小，是因为存在一种情况，添加当前砖块，不会使得与屋顶连接的砖块数更多
            result[i] = Math.max(0, current - origin - 1);
            temp[row][col] = 1;
        }
        return result;
    }

    private int getIndex(int i, int j, int cols) {
        return i * cols + j;
    }

    private boolean inArea(int i, int j, int rows, int cols) {
        return i >= 0 && i < rows && j >= 0 && j < cols;
    }

    static class UnionFind {
        // 每个节点的父节点序号
        private final int[] parent;
        // 以节点为父节点的子节点的个数
        private final int[] size;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        /**
         * i 合并到 j
         */
        public void union(int i, int j) {
            int a = find(i), b = find(j);
            if (a == b)
                return;
            parent[a] = b;
            size[b] += size[a];
        }

        public int find(int i) {
            if (parent[i] == i)
                return i;
            else {
                parent[i] = find(parent[i]);
                return parent[i];
            }
        }

        public int getSize(int i) {
            return size[find(i)];
        }
    }
}
