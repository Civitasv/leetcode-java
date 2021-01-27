package main.everyday;

/**
 * 保证图可完全遍历
 */
public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int count = 0;
        UnionFind aliceUf = new UnionFind(n);
        UnionFind bobUf = new UnionFind(n);
        // 先连接所有的公共边
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (aliceUf.isConnected(edge[1], edge[2])) {
                    count++;
                } else {
                    aliceUf.union(edge[1], edge[2]);
                    bobUf.union(edge[1], edge[2]);
                }
            }
        }
        // 再连接Alice边和Bob边
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (aliceUf.isConnected(edge[1], edge[2]))
                    count++;
                else aliceUf.union(edge[1], edge[2]);
            }
            if (edge[0] == 2) {
                if (bobUf.isConnected(edge[1], edge[2]))
                    count++;
                else bobUf.union(edge[1], edge[2]);
            }
        }
        return aliceUf.getSize() * bobUf.getSize() > 1 ? -1 : count;
    }

    static class UnionFind {
        private final int[] father;
        private int size;

        public UnionFind(int n) {
            this.father = new int[n + 1];
            for (int i = 0; i <= n; i++)
                father[i] = i;
            this.size = n;
        }

        public int find(int i) {
            if (father[i] == i)
                return i;
            else {
                father[i] = find(father[i]);
                return father[i];
            }
        }

        public void union(int i, int j) {
            father[find(i)] = find(j);
            this.size -= 1;
        }

        public boolean isConnected(int i, int j) {
            return find(i) == find(j);
        }

        public int getSize() {
            return size;
        }
    }
}
