package main.everyday;

/**
 * 由斜杠划分区域
 */
public class RegionsCutBySlashes {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        UnionFind uf = new UnionFind(4 * n * n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = grid[i].charAt(j);
                if ('/' == c) {
                    uf.union(i * 4 * n + j * 4, i * 4 * n + j * 4 + 1);
                    uf.union(i * 4 * n + j * 4 + 2, i * 4 * n + j * 4 + 3);
                } else if ('\\' == c) {
                    uf.union(i * 4 * n + j * 4, i * 4 * n + j * 4 + 3);
                    uf.union(i * 4 * n + j * 4 + 1, i * 4 * n + j * 4 + 2);
                } else {
                    uf.union(i * 4 * n + j * 4, i * 4 * n + j * 4 + 1);
                    uf.union(i * 4 * n + j * 4 + 1, i * 4 * n + j * 4 + 2);
                    uf.union(i * 4 * n + j * 4 + 2, i * 4 * n + j * 4 + 3);
                }
                // 向右向下
                if (j < n - 1) { // 向右
                    uf.union(i * 4 * n + j * 4 + 2, i * 4 * n + (j + 1) * 4);
                }
                if (i < n - 1) {// 向下
                    uf.union(i * 4 * n + j * 4 + 3, (i + 1) * 4 * n + j * 4 + 1);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 4 * n * n; i++) {
            if (uf.find(i) == i)
                count++;
        }
        return count;
    }

    static class UnionFind {
        private final int[] father;

        public UnionFind(int n) {
            this.father = new int[n];
            for (int i = 0; i < n; i++)
                father[i] = i;
        }

        public void union(int i, int j) {
            father[find(i)] = find(j);
        }

        public int find(int i) {
            if (father[i] == i)
                return father[i];
            else {
                father[i] = find(father[i]);
                return father[i];
            }
        }
    }
}
